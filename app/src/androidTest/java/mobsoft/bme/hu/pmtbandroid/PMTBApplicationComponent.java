package mobsoft.bme.hu.pmtbandroid;

import javax.inject.Singleton;

import mobsoft.bme.hu.pmtbandroid.ui.UIModule;
import mobsoft.bme.hu.pmtbandroid.ui.login.LoginActivity;
import dagger.Component;
import mobsoft.bme.hu.pmtbandroid.ui.login.LoginPresenter;
import mobsoft.bme.hu.pmtbandroid.ui.overview.OverViewActivity;
import mobsoft.bme.hu.pmtbandroid.ui.overview.OverViewPresenter;
import mobsoft.bme.hu.pmtbandroid.ui.projects.ProjectsActivity;
import mobsoft.bme.hu.pmtbandroid.ui.projects.ProjectsPresenter;
import mobsoft.bme.hu.pmtbandroid.ui.record.RecordActivity;
import mobsoft.bme.hu.pmtbandroid.ui.record.RecordPresenter;

/**
 * Created by mobsoft on 2016. 04. 22..
 */
@Singleton
@Component(modules = {UIModule.class})
public interface  PMTBApplicationComponent {
    void inject(LoginActivity loginActivity);
    void inject(LoginPresenter loginPresenter);

    void inject(OverViewActivity overViewActivity);
    void inject(OverViewPresenter overViewPresenter);

    void inject(ProjectsActivity projectsActivity);
    void inject(ProjectsPresenter projectsPresenter);

    //void inject(RecordActivity recordActivity);
   // void inject(RecordPresenter recordPresenter);

    void inject(PMTBApplication app);
}
