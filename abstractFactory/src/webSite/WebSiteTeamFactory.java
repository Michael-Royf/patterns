package webSite;

import model.Developer;
import model.ProjectManger;
import model.ProjectTeamFactory;
import model.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester createTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManger createManager() {
        return new WebsitePm();
    }
}
