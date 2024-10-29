/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colleciones;

/**
 *
 * @author JOHN
 * 
 * Colleciones
 * es un objeto que agrupa multiples elementos en un array
 * Set(no permiten duplicados, no esta ordenado, elemento unicos)
 * List(ordenado, permite duplicado, acceso por indice)
 * Map(clave-valor)
 * 
 */
public class Colleciones {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*
        SET una coleccion que no permite elementos duplicados
        HashSet -> utiliza una tabla hash para almacenar los elementos
        TreeSet
        LinkedHashSet
        */
        
        Super superheroes = new Super();
        
        Hero h1 = new Hero("hero001","Iron Man");
        Hero h2 = new Hero("hero002","Hulk");
        Hero h3 = new Hero("hero003","Spider Man");
        Hero h4 = new Hero("hero001","Pantera Negra");
        
        superheroes.addHero(h1);
        superheroes.addHero(h2);
        superheroes.addHero(h3);
        superheroes.addHero(h4);
        
        System.out.println("Lista de Super Heroes");
        superheroes.listHeros();
        
        /*
        LIST
        una coleccion ordenada de elementos que pueden estar duplicados
        los elementos de una LIST estan indexados y se pueden acceder por su posicion
        ArrayList -> utiliza un arreglo dinamico
        LinkedList -> lista doblemente enlazada para almacenar elementos
        Vector
        */
        /*
        MAP
        una coleccion de elementos por clave-valor
        no permite elememtos(clave) duplicados, pero los valores pueden ser duplicados
        HashMap
        TreeMap
        LinkedMap
        
        */
    }
}
