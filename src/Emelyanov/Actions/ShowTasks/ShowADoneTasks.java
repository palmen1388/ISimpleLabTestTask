package Emelyanov.Actions.ShowTasks;

import Emelyanov.Actions.Action;
import Task.Task;
import Task.TaskStatus;

import java.util.ArrayList;

public class ShowADoneTasks extends Action {

    private final String name;

    public ShowADoneTasks() {
        this.name = "list_done";
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void doAction(ArrayList<Task> taskList) {
        for (Task task : taskList) {
            if (TaskStatus.DONE.equals(task.getTaskStatus())) {
                System.out.println(task);
            }
        }
    }

    public String toString() {
        return name;
    }
}
