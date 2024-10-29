/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colleciones;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author JOHN
 */
public class Super {
    private Set <Hero> supers = new HashSet<>();
    
    public boolean addHero(Hero hero){
        return supers.add(hero);
    }
    
    public boolean deleteHero(String codigo){
        return supers.removeIf(p -> p.getId().equals(codigo));
    }
    
    public void listHeros(){
        supers.forEach(System.out::println);
    }
    
    public Hero lookHero(String codigo){
        return supers.stream().filter(p -> p.getId().equals(codigo)).findFirst().orElse(null);
    }
    
}
