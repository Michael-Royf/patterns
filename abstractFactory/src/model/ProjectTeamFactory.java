package model;

public interface ProjectTeamFactory {
    Developer createDeveloper();

    Tester createTester();

    ProjectManger createManager();
}
