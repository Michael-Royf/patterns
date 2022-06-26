package project.developerFavtory;

import project.Developer.CppDeveloper;
import project.Developer.Developer;

public class CppDeveloperFactory  implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return  new CppDeveloper();
    }
}
