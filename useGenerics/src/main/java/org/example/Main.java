package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
* how the Box<T> class is declared. Here the T is a type parameter, indicating that the Box class can work with any object if that type.
* the most commonly used type parameter names are:
* - K key
* - N number
* - T Type
* - V value
* - S,U,V, etc 2nd, 3rd, 4th types
* */

public class Main {
    public static class Box<T>{
        private T value;

        public Box() {
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    public static <T> void printArray(T[] inputArr){
        for (T element:
             inputArr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Box <String> strBox = new Box<>();
        strBox.setValue("Hello World!");

        System.out.println(strBox.getValue());

        Box <Integer> intBox = new Box<>();
        intBox.setValue(123);
        System.out.println(intBox.getValue());

        Integer[] intArr = {1,2,3,4,5};
        Double[] doubleArr = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArr = {'H','E','L','L','O'};

        System.out.println("Integer array contains");
        printArray(intArr);

        System.out.println("Double array contains");
        printArray(doubleArr);

        System.out.println("Character array contains");
        printArray(charArr);
        
    }

}