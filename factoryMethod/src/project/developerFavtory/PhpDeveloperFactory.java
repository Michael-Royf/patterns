package project.developerFavtory;

import project.Developer.Developer;
import project.Developer.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return  new PhpDeveloper();
    }
}
