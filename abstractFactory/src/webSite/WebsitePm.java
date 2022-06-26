package webSite;

import model.ProjectManger;
import model.ProjectTeamFactory;

public class WebsitePm implements ProjectManger {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages Website project...");
    }
}
