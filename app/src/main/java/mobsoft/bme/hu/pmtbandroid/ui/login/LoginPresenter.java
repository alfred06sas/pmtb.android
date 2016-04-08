package mobsoft.bme.hu.pmtbandroid.ui.login;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
public class LoginPresenter {

    protected LoginScreen screen;

    private static LoginPresenter instance = null;

    protected LoginPresenter() {
        // Exists only to defeat instantiation.
    }
    public static LoginPresenter getInstance() {
        if(instance == null) {
            instance = new LoginPresenter();
        }
        return instance;
    }

    public void attachView (LoginScreen screen) {
        this.screen = screen;
    }
    public void detachView() {
        this.screen =null;
    }
    public void checkLogIn(String userName, String password) {
        screen.attemptLogin(userName, password);
    }
}
