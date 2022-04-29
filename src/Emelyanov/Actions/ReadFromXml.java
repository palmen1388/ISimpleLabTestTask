package Emelyanov.Actions;

import Emelyanov.XmlTaskSpace;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ReadFromXml {
    public XmlTaskSpace doAction() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(XmlTaskSpace.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();
            return (XmlTaskSpace) un.unmarshal(new File("MyTasks.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}

