package Emelyanov.Actions.ShowTasks;

import Emelyanov.Actions.Actionable;
import Task.Task;
import Task.TaskStatus;

public class ShowInProgressTasks implements Actionable {


    @Override
    public void doAction() {
        for (Task task : taskList) {
            if (TaskStatus.IN_PROGRESS.equals(task.getTaskStatus())) {
                System.out.println(task.toString());
            }
        }
    }
}
