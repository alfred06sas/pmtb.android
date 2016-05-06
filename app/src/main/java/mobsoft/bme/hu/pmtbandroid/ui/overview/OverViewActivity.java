package mobsoft.bme.hu.pmtbandroid.ui.overview;

import android.support.v7.app.AppCompatActivity;
import javax.inject.Inject;
/**
 * Created by Csabi on 2016. 05. 05..
 */
public class OverViewActivity extends AppCompatActivity implements OverViewScreen {

    @Inject
    public OverViewPresenter activityPresenter;

    @Override
    public void getWorkTimes() {

    }

    @Override
    public void cancel() {

    }

    @Override
    public void navigateToRecordedWorkTime(int worktimeId) {

    }
}
