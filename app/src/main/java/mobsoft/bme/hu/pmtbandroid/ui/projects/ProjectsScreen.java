package mobsoft.bme.hu.pmtbandroid.ui.projects;

/**
 * Created by Csabi on 2016. 05. 05..
 */
public interface ProjectsScreen {
    public void getProjects();
    public void exit();
    public void recordWorkTime();
    public void recordWorkTimeToProject(int projectId);
}
