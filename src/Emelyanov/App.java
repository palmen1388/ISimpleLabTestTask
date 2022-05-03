package Emelyanov;

import Emelyanov.Actions.*;
import Emelyanov.Actions.ShowTasks.ShowADoneTasks;
import Emelyanov.Actions.ShowTasks.ShowInProgressTasks;
import Emelyanov.Actions.ShowTasks.ShowNewTasks;
import Emelyanov.Actions.ShowTasks.ShowTasks;
import Task.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> taskList = new ArrayList<>();
        Save save = new SaveToXml();
        Read read = new ReadFromXml();
        Action[] actions = {
                read,
                new CreateNewTask(),
                new EditTask(),
                new RemoveTask(),
                new TagTaskLikeDone(),
                new TagTaskLikeInProgress(),
                new ShowTasks(),
                new ShowNewTasks(),
                new ShowADoneTasks(),
                new ShowInProgressTasks(),
                save};
        ActionMenu actionMenu = new ActionMenu(actions);
        System.out.println("Можете ввести help для вывода команд");
        String userValue = scanner.nextLine();
        while (!"exit".equalsIgnoreCase(userValue)) {
            actionMenu.executeAction(userValue, taskList);
            int id = 1;
            for (Task task : taskList) {
                task.setId(id);
                id++;
            }
            userValue = scanner.nextLine();
        }
        actionMenu.executeAction(userValue, taskList);
    }
}

