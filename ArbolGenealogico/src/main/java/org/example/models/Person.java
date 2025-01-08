package org.example.models;

import org.example.service.RelationShip;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Person {
    private int id;
    private String name;
    private boolean isLife;
    private String gender;
    private String birthday;

    public Person(int id, String name, String gender, String birthday) {
        this.id = id;
        this.name = name;
        this.isLife = true;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Person(String name, String gender) {
        this.name = name;
        this.isLife = true;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isLife=" + isLife +
                ", gender=" + gender +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLife() {
        return isLife;
    }

    public void setLife(boolean life) {
        isLife = life;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
