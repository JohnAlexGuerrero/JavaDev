/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javanotesprofessional.OOP;

/**
 *
 * @author JOHN
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public String getName() {
        if(name.length() > 16){
            return "Name is too large!";
        }else{
            return name;
        }
    }

    public void setName(String name) {
        if(name !=null && name.length() > 2){
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    
}
