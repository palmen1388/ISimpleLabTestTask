package Emelyanov;

import Emelyanov.Actions.*;
import Emelyanov.Actions.ShowTasks.ShowADoneTasks;
import Emelyanov.Actions.ShowTasks.ShowInProgressTasks;
import Emelyanov.Actions.ShowTasks.ShowNewTasks;
import Emelyanov.Actions.ShowTasks.ShowTasks;

public class TodoListActionFactory {



    public Actionable createAction(ActionMenu value) {
        Actionable action = null;
        switch (value) {
            case CREATE:
                return action = new CreateNewTask();
            case REMOVE:
                return action = new RemoveTask();
            case EDIT:
                return action = new EditTask();
            case EXIT:
                return action = new ExitAndSave();
            case REFERENCE:
                return action = new Reference();
            case DONE:
                return action = new TagTaskLikeDone();
            case IN_PROGRESS:
                return action = new TagTaskLikeInProgress();
            case LIST_NEW:
                return action = new ShowNewTasks();
            case LIST:
                return action = new ShowTasks();
            case LIST_DONE:
                return action = new ShowADoneTasks();
            case LIST_IN_PROGRESS:
                return action = new ShowInProgressTasks();
        }
        return null;
    }
}
