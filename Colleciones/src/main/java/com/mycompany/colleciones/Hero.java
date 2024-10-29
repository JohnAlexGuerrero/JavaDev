/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colleciones;

/**
 *
 * @author JOHN
 */
public class Hero {
    private String id;
    private String name;

    public Hero(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj)return true;
        if(this == null || getClass() != obj.getClass())return false;
        Hero hero = (Hero) obj;
        
        return id.equals(hero.id); 
    }
    
    @Override
    public int hashCode(){
        return id.hashCode();
    }
    
    @Override
    public String toString(){
        return "Hero {"+" codigo='"+id+"', nombre='"+name+"'}";
    }
    
    
}
