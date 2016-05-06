package mobsoft.bme.hu.pmtbandroid.model.prod;

import java.util.ArrayList;
import java.util.List;

import mobsoft.bme.hu.pmtbandroid.model.Project;
import mobsoft.bme.hu.pmtbandroid.model.WorkTime;

/**
 * Created by mobsoft on 2016. 05. 06..
 */
public class WorkTimesDbModel {

    public WorkTimesDbModel() {

    }

    public List<WorkTime> fetchPeople() {
      /*  List<Project> values = Project.listAll(Project.class);
        return values;*/
        return new ArrayList<WorkTime>();
    }

    public void insertPerson(WorkTime toInsert) {
        // toInsert.save();
    }

}
