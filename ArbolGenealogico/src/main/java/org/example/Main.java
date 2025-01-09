package org.example;

import org.example.DAO.FamilyDAO;
import org.example.DAO.PersonDAO;
import org.example.models.FamilyTree;
import org.example.models.Person;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static final PersonDAO personDAO = new PersonDAO();
    static final FamilyDAO familyDAO = new FamilyDAO();
    static final Scanner scanner = new Scanner(System.in);
    public static void menu(){
        System.out.println("2. Familias");
        System.out.println("1. Agregar Persona.");
        System.out.println("3. exit.");
    }

    public static Person personManager(){
        System.out.println("Nombre: ");
        String namePerson = scanner.next();
        System.out.println("Genero (Male / Female): ");
        String genderPerson = scanner.next();
        return new Person(namePerson, genderPerson);
    }

    public static void main(String[] args) {
        int option;

        while(true){
            menu();
            option = scanner.nextInt();

            switch (option){
                case 1:
                    Person p = personManager();
                    personDAO.createPerson(p);
                    break;
                case 3:
                    System.exit(1);
                default:
                    System.out.println("Opcion no permitida.");
            }
        }

        // create family
//        FamilyTree family = new FamilyTree("Targaryen");
  //      familyDAO.createFamily(family);
    }
}