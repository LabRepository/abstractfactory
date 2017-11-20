package eu.jpereira.trainings.designpatterns.creational.abstractfactory;

import eu.jpereira.trainings.designpatterns.creational.abstractfactory.json.JSONReportFactory;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.xml.XMLReportFactory;

public class ReportFactoryProducer {
    private String Factory;
    public ReportFactoryProducer(String factory){
        this.Factory = factory;
    }

    public ReportCreator getFactory(){
        if(Factory.equals("JSON")){
            return new JSONReportFactory();
        } else if (Factory.equals("XML")){
            return new XMLReportFactory();
        } else {
            return null;
        }
    }
}
