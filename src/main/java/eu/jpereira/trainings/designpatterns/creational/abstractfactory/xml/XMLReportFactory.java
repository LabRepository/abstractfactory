package eu.jpereira.trainings.designpatterns.creational.abstractfactory.xml;

import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportBody;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportCreator;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportFooter;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportHeader;

public class XMLReportFactory implements ReportCreator {
    @Override
    public ReportHeader reportCreatorHeader() {
        return new XMLReportHeader();
    }

    @Override
    public ReportFooter reportCreatorFooter() {
        return new XMLReportFooter();
    }

    @Override
    public ReportBody reportCreatorBody() {
        return new XMLReportBody();
    }
}
