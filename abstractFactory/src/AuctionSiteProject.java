import model.Developer;
import model.ProjectManger;
import model.ProjectTeamFactory;
import model.Tester;
import webSite.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.createDeveloper();
        Tester tester = projectTeamFactory.createTester();
        ProjectManger projectManger  = projectTeamFactory.createManager();

        System.out.println("Creating auction website...");

        developer.writeCode();
        tester.testCode();
        projectManger.manageProject();
    }
}
