package mobsoft.bme.hu.pmtbandroid.model.mock;

import java.util.LinkedList;
import java.util.List;

import mobsoft.bme.hu.pmtbandroid.model.Project;
import mobsoft.bme.hu.pmtbandroid.model.prod.ProjectsDbModel;

/**
 * Created by mobsoft on 2016. 05. 06..
 */
public class MockProjectsDbModel extends ProjectsDbModel {

    LinkedList<Project> values = new LinkedList<>();

    public MockProjectsDbModel() {
        values.add(new Project("Teszt prjekt 1", 1, 20));
        values.add(new Project("Teszt prjekt 2", 2, 66));
        values.add(new Project("Teszt prjekt 3", 3, 0));
        values.add(new Project("Teszt prjekt 4", 4, 100));
    }

    @Override
    public List<Project> fetchPeople() {
        return values;
    }

    @Override
    public void insertPerson(Project toInsert) {
        values.add(toInsert);
    }

}
