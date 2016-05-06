package mobsoft.bme.hu.pmtbandroid.ui;

import android.content.Context;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mobsoft.bme.hu.pmtbandroid.ui.login.LoginPresenter;
import mobsoft.bme.hu.pmtbandroid.ui.overview.OverViewPresenter;
import mobsoft.bme.hu.pmtbandroid.ui.projects.ProjectsPresenter;
import mobsoft.bme.hu.pmtbandroid.ui.record.RecordActivity;

@Module
public class UIModule {
    private Context context;

    public UIModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public LoginPresenter provideLoginPresenter() {
        return new LoginPresenter();
    }

    @Provides
    @Singleton
    public OverViewPresenter provideOverViewPresenter() {
        return new OverViewPresenter();
    }

    @Provides
    @Singleton
    public ProjectsPresenter provideProjectsPresenter() {
        return new ProjectsPresenter();
    }

    @Provides
    @Singleton
    public RecordActivity provideRecordActivity() {
        return new RecordActivity();
    }


}