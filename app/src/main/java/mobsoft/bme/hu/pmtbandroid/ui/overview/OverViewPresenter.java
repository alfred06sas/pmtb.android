package mobsoft.bme.hu.pmtbandroid.ui.overview;

/**
 * Created by Csabi on 2016. 05. 05..
 */
public class OverViewPresenter {

    protected OverViewScreen screen;

    public void attachView (OverViewScreen screen) {
        this.screen = screen;
    }
    public void detachView() {
        this.screen =null;
    }
    public void getWorkTimes() {this.screen.getWorkTimes();}
    public void cancel() {this.screen.cancel();}
    public void navigateToRecordedWorkTime(int worktimeId){this.screen.navigateToRecordedWorkTime(worktimeId);}

}
