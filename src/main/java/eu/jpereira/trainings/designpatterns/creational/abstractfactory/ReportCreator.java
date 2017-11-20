package eu.jpereira.trainings.designpatterns.creational.abstractfactory;

public interface ReportCreator {

    public ReportHeader reportCreatorHeader();
    public ReportFooter reportCreatorFooter();
    public ReportBody reportCreatorBody();
}
