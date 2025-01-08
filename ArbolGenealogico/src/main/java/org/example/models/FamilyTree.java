package org.example.models;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FamilyTree {
    private String nameFamily;
    private Long id;
    private Map< Long, List<Person> > people;

    public FamilyTree(Long id, String nameFamily) {
        this.nameFamily = nameFamily;
        this.people = new HashMap<>();
        this.id = id;
    }

    public void addRelationShip(List<Person> persons){
        people.put(this.id, persons);
    }

}
