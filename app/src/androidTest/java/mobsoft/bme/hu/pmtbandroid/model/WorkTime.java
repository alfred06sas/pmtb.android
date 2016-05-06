package mobsoft.bme.hu.pmtbandroid.model;

import java.util.Date;
import java.util.Objects;

/**
 * Created by mobsoft on 2016. 05. 06..
 */
public class WorkTime {

        //@SerializedName("name")
        private Date date = null;
        private String currentUser = "";
        private int projectId = 0;
        private double completed = 0.0;

        public WorkTime() {
            date = new Date();
        }

        public WorkTime(Date date, String currentUser, int projectId, double completed) {
            this.date = date;
            this.currentUser = currentUser;
            this.projectId = projectId;
            this.completed = completed;
        }
        /**
         **/
        //@ApiModelProperty(value = "")
        public Date getDate() {
            return date;
        }
        public void setDate(String name) {
            this.date = date;
        }

        public int getProjectId() {
        return projectId;
    }
        public void setProjectId(int Id) {
        this.projectId = Id;
    }

        public String getCurrentUser() {
            return currentUser;
        }
        public void setCurrentUser(String Id) {
            this.currentUser = currentUser;
        }

        public double getCompleted() {
            return completed;
        }
        public void setCompleted(double name) {
            this.completed = completed;
        }

  /*      @Override
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
}*/
}