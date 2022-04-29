package Emelyanov.Actions;

import Emelyanov.ActionMenu;
import Emelyanov.XmlTaskSpace;

public class Reference implements Actionable{

    private ActionMenu[] actions = ActionMenu.values();

    @Override
    public void doAction() {
        for (ActionMenu actionMenu: actions) {
            if (!ActionMenu.WRONG_VALUE.equals(actionMenu)) {
                System.out.println(actionMenu.menuDescription);
            }
        }
    }
}
