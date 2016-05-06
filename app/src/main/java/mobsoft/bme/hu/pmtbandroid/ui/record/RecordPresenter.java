package mobsoft.bme.hu.pmtbandroid.ui.record;

/**
 * Created by Csabi on 2016. 05. 05..
 */
public class RecordPresenter {

    protected RecordScreen screen;

    public void attachView (RecordScreen screen) {
        this.screen = screen;
    }
    public void detachView() {
        this.screen =null;
    }
    public void getProjects() {this.screen.getProjects();}
    public void cancel() {this.screen.cancel();}
    public void saveRecordedWorkTime() {this.screen.saveRecordedWorkTime();}
}
