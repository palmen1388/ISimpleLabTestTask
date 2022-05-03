package Emelyanov.Actions.ShowTasks;

import Emelyanov.Actions.Action;
import Task.Task;

import java.util.ArrayList;

public class ShowTasks extends Action {

    private String name;

    public ShowTasks() {
        this.name = "list";
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void doAction(ArrayList<Task> taskList) {
        for (Task task : taskList) {
            System.out.println(task.toString());
        }
    }

    public String toString() {
        return name;
    }
}
