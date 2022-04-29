package Emelyanov;

public class UserConsoleValue {

    private String userValue;


    public ActionMenu getUserValue() {
        if (userValue.equalsIgnoreCase("new")) {
            return ActionMenu.CREATE;
        }
        if (userValue.equalsIgnoreCase("edit")) {
            return ActionMenu.EDIT;
        }
        if (userValue.equalsIgnoreCase("complete")) {
            return ActionMenu.DONE;
        }
        if (userValue.equalsIgnoreCase("in_progress")) {
            return ActionMenu.IN_PROGRESS;
        }
        if (userValue.equalsIgnoreCase("list")) {
            return ActionMenu.LIST;
        }
        if (userValue.equalsIgnoreCase("list -s new")) {
            return ActionMenu.LIST_NEW;
        }
        if (userValue.equalsIgnoreCase("list -s in_progress")) {
            return ActionMenu.LIST_IN_PROGRESS;
        }
        if (userValue.equalsIgnoreCase("list -s done")) {
            return ActionMenu.LIST_DONE;
        }
        if (userValue.equalsIgnoreCase("remove")) {
            return ActionMenu.REMOVE;
        }
        if (userValue.equalsIgnoreCase("exit")) {
            return ActionMenu.EXIT;
        }
        if (userValue.equalsIgnoreCase("help")) {
            return ActionMenu.REFERENCE;
        } else {
            return ActionMenu.WRONG_VALUE;
        }
    }

    public void setUserValue(String userValue) {
        this.userValue = userValue;
    }
}
