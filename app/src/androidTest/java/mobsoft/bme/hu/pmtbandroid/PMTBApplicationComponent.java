package mobsoft.bme.hu.pmtbandroid;

import javax.inject.Singleton;

import mobsoft.bme.hu.pmtbandroid.ui.UIModule;
import mobsoft.bme.hu.pmtbandroid.ui.login.LoginActivity;
import dagger.Component;
import mobsoft.bme.hu.pmtbandroid.ui.login.LoginPresenter;

/**
 * Created by mobsoft on 2016. 04. 22..
 */
@Singleton
@Component(modules = {UIModule.class})
public interface  PMTBApplicationComponent {
    void inject(LoginActivity loginActivity);

    void inject(LoginPresenter loginPresenter);
}
