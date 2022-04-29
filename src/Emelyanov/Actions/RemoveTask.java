package Emelyanov.Actions;

import Emelyanov.XmlTaskSpace;

import java.util.Scanner;

public class RemoveTask implements Actionable{

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void doAction() {
        System.out.println("Введите id задачи которую хотите удалить");
        int id = scanner.nextInt();
        for (int i = 0; i < taskList.size(); i++) {
            if (id == taskList.get(i).getId()) {
                taskList.remove(i);
            }
        }
    }
}

