package Emelyanov.Actions;

import Emelyanov.XmlTaskSpace;
import Task.Task;
import Task.TaskStatus;

import java.util.Scanner;

public class TagTaskLikeInProgress implements Actionable{

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void doAction() {
        System.out.println("Введите id задачи которую хотите пометить как в процессе");
        int id = scanner.nextInt();
        for (Task task: taskList) {
            if (id == task.getId()) {
                task.setTaskStatus(TaskStatus.IN_PROGRESS);
            }
        }
    }
}
