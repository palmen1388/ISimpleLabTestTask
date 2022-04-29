package Emelyanov.Actions;

import Emelyanov.XmlTaskSpace;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class ExitAndSave implements Actionable{
    @Override
    public void doAction() {
        XmlTaskSpace xmlTaskSpace = new XmlTaskSpace();
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(XmlTaskSpace.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(xmlTaskSpace, new File("MyTasks.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
