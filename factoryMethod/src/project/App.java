package project;

import project.Developer.Developer;
import project.Developer.JavaDeveloper;
import project.developerFavtory.CppDeveloperFactory;
import project.developerFavtory.DeveloperFactory;
import project.developerFavtory.JavaDeveloperFactory;
import project.developerFavtory.PhpDeveloperFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("enter the programming language: java or c++ or php");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String speciality = bufferedReader.readLine();
        DeveloperFactory developerFactory = createDeveloperBySpeciality(speciality);
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

    }

    static public DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException("Speciality " + speciality + " is unknown");
        }
    }

}
