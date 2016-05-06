package mobsoft.bme.hu.pmtbandroid.ui.projects;

/**
 * Created by Csabi on 2016. 05. 05..
 */
public class ProjectsPresenter {

    protected ProjectsScreen screen;

    public void attachView (ProjectsScreen screen) {
        this.screen = screen;
    }
    public void detachView() {
        this.screen = null;
    }
    public void exit() {screen.exit();}
    public void recordWorkTime() {screen.recordWorkTime();}
    public void recordWorkTimeToProject(int projectId) {screen.recordWorkTimeToProject(projectId);}
    public void getProjects() {screen.getProjects();}

}
