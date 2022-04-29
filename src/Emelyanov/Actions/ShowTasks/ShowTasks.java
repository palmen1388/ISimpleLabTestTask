package Emelyanov.Actions.ShowTasks;

import Emelyanov.Actions.Actionable;
import Emelyanov.XmlTaskSpace;
import Task.Task;

public class ShowTasks implements Actionable {


    @Override
    public void doAction() {
        for (Task task : taskList) {
            System.out.println(task.toString());
        }
    }
}
