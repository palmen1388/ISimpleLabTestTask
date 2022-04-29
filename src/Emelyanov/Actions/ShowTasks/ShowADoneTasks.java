package Emelyanov.Actions.ShowTasks;

import Emelyanov.Actions.Actionable;
import Task.Task;
import Task.TaskStatus;

public class ShowADoneTasks implements Actionable {


    @Override
    public void doAction() {
        for (Task task : taskList) {
            if (TaskStatus.DONE.equals(task.getTaskStatus())) {
                System.out.println(task.toString());
            }
        }
    }
}
