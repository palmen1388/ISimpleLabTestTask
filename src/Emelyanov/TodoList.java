package Emelyanov;

import Emelyanov.Actions.Actionable;

public class TodoList {

    private final TodoListActionFactory actionFactory;


    public TodoList(TodoListActionFactory actionFactory) {
        this.actionFactory = actionFactory;
    }


    public void chooseAction(ActionMenu value) {
        Actionable action = actionFactory.createAction(value);
        action.doAction();
    }
}
