package mobsoft.bme.hu.pmtbandroid.model.prod;

import java.util.ArrayList;
import java.util.List;

import mobsoft.bme.hu.pmtbandroid.model.Project;

/**
 * Created by mobsoft on 2016. 05. 06..
 */
public class ProjectsDbModel {

    public ProjectsDbModel() {

    }

    public List<Project> fetchPeople() {
      /*  List<Project> values = Project.listAll(Project.class);
        return values;*/
        return new ArrayList<Project>();
    }

    public void insertPerson(Project toInsert) {
       // toInsert.save();
    }

}
