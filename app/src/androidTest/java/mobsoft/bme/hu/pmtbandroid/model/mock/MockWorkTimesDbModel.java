package mobsoft.bme.hu.pmtbandroid.model.mock;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import mobsoft.bme.hu.pmtbandroid.model.Project;
import mobsoft.bme.hu.pmtbandroid.model.WorkTime;
import mobsoft.bme.hu.pmtbandroid.model.prod.ProjectsDbModel;
import mobsoft.bme.hu.pmtbandroid.model.prod.WorkTimesDbModel;

/**
 * Created by mobsoft on 2016. 05. 06..
 */
public class MockWorkTimesDbModel  extends WorkTimesDbModel {

    LinkedList<WorkTime> values = new LinkedList<>();

    public MockWorkTimesDbModel() {
        values.add(new WorkTime(new Date(),"Teszt Béla", 1, 20));
        values.add(new WorkTime(new Date(),"Teszt Kata", 2, 66));
        values.add(new WorkTime(new Date(),"Teszt Gizi", 3, 0));
        values.add(new WorkTime(new Date(),"Teszt Péter", 4, 100));
    }

    @Override
    public List<WorkTime> fetchPeople() {
        return values;
    }

    @Override
    public void insertPerson(WorkTime toInsert) {
        values.add(toInsert);
    }

}
