package Emelyanov;

public enum ActionMenu {

    WRONG_VALUE ("Неверное значение"),
    CREATE ("new - создать задачу"),
    EDIT("edit - редактировать задачу"),
    DONE("complete - пометить задачу как выполненную"),
    IN_PROGRESS("in_progress - пометить задачу как выполняемую"),
    LIST("list - вывести все задачи"),
    LIST_NEW("list -s new - чтобы вывести все новые задачи"),
    LIST_IN_PROGRESS("list -s in_progress - чтобы вывести все выполняемые задачи"),
    LIST_DONE("list -s done - чтобы вывести все выполненные задачи"),
    REMOVE("remove - чтобы удалить"),
    EXIT("exit - чтобы выйти"),
    REFERENCE("help - чтобы получить справку");

    public String menuDescription;


    ActionMenu(String menuDescription) {
        this.menuDescription = menuDescription;
    }
}
