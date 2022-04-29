package Emelyanov.Actions;

import Task.Task;

import java.util.Scanner;

public class EditTask implements Actionable{

    private Scanner scanner = new Scanner(System.in);
    private String confirmation;

    @Override
    public void doAction() {
        System.out.println("Введите id задачи которую хотите изменить");
        int id = scanner.nextInt();
        for (Task task: taskList) {
            if (task.getId() == id) {
                System.out.println("Вы действительно хотите изменить задачу, если уверены 'Y' иначе 'N'");
                confirmation = scanner.next();
                while (!("y".equalsIgnoreCase(confirmation) || "n".equalsIgnoreCase(confirmation))) {
                    System.out.println("Введите 'Y' или 'N'");
                    confirmation = scanner.next();
                }
                if (confirmation.equalsIgnoreCase("y")) {
                    System.out.println("Измените заголовок задачи от 1 до 50 символов");
                    task.setHeader(scanner.next());
                    if (task.getHeader().length() > 50) {
                        String cutString = task.getHeader().substring(0, 50);
                        task.setHeader(cutString);
                    }
                    System.out.println("Измените описание задачи");
                    task.setDescription(scanner.next());
                    System.out.println("Измените важность задачи");
                    task.setPriority(scanner.nextInt());
                    while (task.getPriority() < 0 || task.getPriority() > 10) {
                        System.out.println("Введите значение от 0 до 10");
                        task.setPriority(scanner.nextInt());
                    }
                }
                else if (confirmation.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }
    }
}
