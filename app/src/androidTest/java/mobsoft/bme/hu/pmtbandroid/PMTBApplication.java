package mobsoft.bme.hu.pmtbandroid;

import javax.inject.Singleton;

import android.app.Application;

import mobsoft.bme.hu.pmtbandroid.ui.UIModule;

/**
 * Created by mobsoft on 2016. 04. 22..
 */
public class PMTBApplication extends Application {

    public static PMTBApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();

        injector =
                DaggerPMTBApplicationComponent.builder().
                        uIModule(
                                new UIModule(this)
                        ).build();
    }

}
