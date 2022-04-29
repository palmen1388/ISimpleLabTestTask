package Emelyanov;

import Task.Task;
import Emelyanov.Actions.Actionable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
@XmlRootElement(name = "TodoList")
public class XmlTaskSpace {

    @XmlElement(name = "task")
    private ArrayList<Task> list = Actionable.taskList;
}
