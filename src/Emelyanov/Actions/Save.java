package Emelyanov.Actions;

import Task.Task;

import java.util.ArrayList;

public abstract class Save extends Action {


    @Override
    public abstract void doAction(ArrayList<Task> taskList);

}