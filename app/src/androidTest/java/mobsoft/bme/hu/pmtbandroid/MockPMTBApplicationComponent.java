package mobsoft.bme.hu.pmtbandroid;

import javax.inject.Singleton;

import dagger.Component;
import mobsoft.bme.hu.pmtbandroid.ui.UIModule;

/**
 * Created by mobsoft on 2016. 05. 06..
 */

@Singleton
@Component(modules = {UIModule.class})
public interface MockPMTBApplicationComponent extends PMTBApplicationComponent{
}
