package banking;

import model.Developer;
import model.ProjectManger;
import model.ProjectTeamFactory;
import model.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new QATester();
    }

    @Override
    public ProjectManger createManager() {
        return new BankingPM();
    }
}
