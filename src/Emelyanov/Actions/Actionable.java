package Emelyanov.Actions;

import Task.Task;

import java.util.ArrayList;

public interface Actionable {

    ArrayList <Task> taskList = new ArrayList<>();


    void doAction();

}
