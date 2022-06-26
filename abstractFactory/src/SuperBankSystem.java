import banking.BankingTeamFactory;
import model.Developer;
import model.ProjectManger;
import model.ProjectTeamFactory;
import model.Tester;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer =  projectTeamFactory.createDeveloper();
        Tester tester = projectTeamFactory.createTester();
        ProjectManger projectManger = projectTeamFactory.createManager();


        System.out.println("Creating bank system...");
       developer.writeCode();
       tester.testCode();
       projectManger.manageProject();
    }
}
