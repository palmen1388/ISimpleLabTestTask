package Task;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"id", "header", "description", "priority", "date", "taskStatus", "dateOfCompletion"})
public class Task {

    private int id;
    private String header;
    private String description;
    private int priority;
    private String date;
    private TaskStatus taskStatus;
    private String dateOfCompletion;


    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlAttribute
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getDateOfCompletion() {
        return dateOfCompletion;
    }

    public void setDateOfCompletion(String dateOfCompletion) {
        this.dateOfCompletion = dateOfCompletion;
    }

    @Override
    public String toString() {
        if (dateOfCompletion != null) {
            return "Task id = " + id + "{ Header = " + header +
                    ", Description = " + description +
                    ", priority =" + priority +
                    ", date = " + date +
                    ", taskStatus = " + taskStatus +
                    ", dateOfCompletion = " + dateOfCompletion + " }";
        } else {
            return "Task id = " + id + "{ Header = " + header +
                    ", Description = " + description +
                    ", priority =" + priority +
                    ", date = " + date +
                    ", taskStatus = " + taskStatus + " }";
        }
    }
}
