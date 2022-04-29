package Emelyanov.Actions;

import Emelyanov.XmlTaskSpace;
import Task.Task;
import Task.TaskStatus;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TagTaskLikeDone implements Actionable{

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void doAction() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String currentDate = dateFormat.format(date);
        System.out.println("Введите id задачи которую хотите пометить как выполненную");
        int id = scanner.nextInt();
        for (Task task: taskList) {
            if (id == task.getId()) {
                task.setTaskStatus(TaskStatus.DONE);
                task.setDateOfCompletion(currentDate);
            }
        }
    }
}
