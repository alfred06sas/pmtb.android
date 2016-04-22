package mobsoft.bme.hu.pmtbandroid.ui.login;

/**
 * Created by mobsoft on 2016. 04. 08..
 */
public class LoginPresenter {

    protected LoginScreen screen;

    public void attachView (LoginScreen screen) {
        this.screen = screen;
    }
    public void detachView() {
        this.screen =null;
    }
    public void checkLogIn(String userName, String password) {
        screen.login(userName, password);
    }
}
