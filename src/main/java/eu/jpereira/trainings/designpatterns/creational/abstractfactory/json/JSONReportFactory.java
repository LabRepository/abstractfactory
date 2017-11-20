package eu.jpereira.trainings.designpatterns.creational.abstractfactory.json;

import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportBody;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportCreator;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportFooter;
import eu.jpereira.trainings.designpatterns.creational.abstractfactory.ReportHeader;

public class JSONReportFactory implements ReportCreator {
    @Override
    public ReportHeader reportCreatorHeader() {
        return new JSONReportHeader();
    }

    @Override
    public ReportFooter reportCreatorFooter() {
        return new JSONReportFooter();
    }

    @Override
    public ReportBody reportCreatorBody() {
        return new JSONReportBody();
    }
}
