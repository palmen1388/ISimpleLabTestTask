package Emelyanov.Actions;

import Emelyanov.XmlTaskSpace;
import Task.Task;
import Task.TaskStatus;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CreateNewTask implements Actionable{

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void doAction() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String currentDate = dateFormat.format(date);
        Task task = new Task();
        task.setTaskStatus(TaskStatus.NEW);
        System.out.println("Введите заголовок задачи от 1 до 50 символов");
        task.setHeader(scanner.nextLine());
        if (task.getHeader().length() > 50) {
            String cutString = task.getHeader().substring(0, 50);
            task.setHeader(cutString);
        }
        System.out.println("Введите описание задачи");
        task.setDescription(scanner.nextLine());
        System.out.println("Введите приоритетность задачи от 0 до 10");
        task.setPriority(scanner.nextInt());
        while (task.getPriority() < 0 || task.getPriority() >10) {
            System.out.println("Введите значение от 0 до 10");
            task.setPriority(scanner.nextInt());
        }
        task.setDate(currentDate);
        taskList.add(task);
    }
}
