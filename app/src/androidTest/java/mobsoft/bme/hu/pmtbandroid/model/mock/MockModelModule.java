package mobsoft.bme.hu.pmtbandroid.model.mock;

import dagger.Provides;
import mobsoft.bme.hu.pmtbandroid.model.prod.ProjectsDbModel;
import mobsoft.bme.hu.pmtbandroid.model.prod.WorkTimesDbModel;

/**
 * Created by mobsoft on 2016. 05. 06..
 */
public class MockModelModule {
    @Provides
    public ProjectsDbModel provideMockProjectsDbModel() {
        return new MockProjectsDbModel();
    }

    @Provides
    public WorkTimesDbModel provideMockWorkTimesDbModel() {
        return new MockWorkTimesDbModel();
    }
}
