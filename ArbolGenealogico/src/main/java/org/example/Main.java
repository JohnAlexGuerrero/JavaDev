package org.example;

import org.example.DAO.FamilyDAO;
import org.example.DAO.PersonDAO;
import org.example.models.FamilyTree;
import org.example.models.Person;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        FamilyDAO familyDAO = new FamilyDAO();

        // create Person
        //Person p = new Person("Daemon Targaryen", "male");
        //personDAO.createPerson(p);

        // create family
        FamilyTree family = new FamilyTree("Targaryen");
        familyDAO.createFamily(family);
    }
}