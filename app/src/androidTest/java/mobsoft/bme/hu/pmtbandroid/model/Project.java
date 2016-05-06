package mobsoft.bme.hu.pmtbandroid.model;

import java.util.Objects;

/**
 * Created by mobsoft on 2016. 05. 06..
 */
public class Project {

    //@SerializedName("name")
    private String name = null;
    private int Id = 0;
    private double completed = 0.0;

    public Project() {
        name = "ChangeIt";
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, int Id, double completed) {
        this.name = name;
        this.Id = Id;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     **/
    //@ApiModelProperty(value = "")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }

    public double getCompleted() {
        return completed;
    }
    public void setCompleted(double name) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Project person = (Project) o;
        return Objects.equals(Id, person.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
