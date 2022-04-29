package Emelyanov;

import Emelyanov.Actions.Actionable;
import Emelyanov.Actions.ReadFromXml;
import Task.Task;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ReadFromXml reader = new ReadFromXml();
        Scanner scanner = new Scanner(System.in);
        UserConsoleValue consoleValue = new UserConsoleValue();
        TodoList todoList = new TodoList(new TodoListActionFactory());
        System.out.println("Если хотите загрузить список дел из документа введите 'read' если не хотите введите 'no read'");
        String stForRead = scanner.nextLine();
        while (!("read".equalsIgnoreCase(stForRead) || "no read".equalsIgnoreCase(stForRead))) {
            System.out.println("Введите 'read' или 'no read'");
            stForRead = scanner.nextLine();
        }
        if (stForRead.equalsIgnoreCase("read")) {
            reader.doAction();
        }
        System.out.println("Введите help для вызова справки");
        System.out.println("Введите команду");
        consoleValue.setUserValue(scanner.nextLine());
        while (consoleValue.getUserValue().equals(ActionMenu.WRONG_VALUE)) {
            System.out.println("Команда нераспознана, введите еще раз");
            consoleValue.setUserValue(scanner.nextLine());
        }
        while (!ActionMenu.EXIT.equals(consoleValue.getUserValue())) {
            todoList.chooseAction(consoleValue.getUserValue());
            int id = 0;
            for (Task task : Actionable.taskList) {
                Actionable.taskList.get(id).setId(Actionable.taskList.indexOf(task) + 1);
                id++;
            }
            System.out.println("Введите команду");
            consoleValue.setUserValue(scanner.nextLine());
            while (consoleValue.getUserValue().equals(ActionMenu.WRONG_VALUE)) {
                System.out.println("Команда нераспознана, введите еще раз");
                consoleValue.setUserValue(scanner.nextLine());
            }
        }
        todoList.chooseAction(consoleValue.getUserValue());
    }
}

