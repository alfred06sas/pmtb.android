package mobsoft.bme.hu.pmtbandroid.ui.projects;

import android.support.v7.app.AppCompatActivity;
import javax.inject.Inject;
/**
 * Created by Csabi on 2016. 05. 05..
 */
public class ProjectsActivity extends AppCompatActivity implements ProjectsScreen {

    @Inject
    public ProjectsPresenter projectPresenter;

    @Override
    public void getProjects() {

    }

    @Override
    public void exit() {

    }

    @Override
    public void recordWorkTime() {

    }

    @Override
    public void recordWorkTimeToProject(int projectId) {

    }
}
