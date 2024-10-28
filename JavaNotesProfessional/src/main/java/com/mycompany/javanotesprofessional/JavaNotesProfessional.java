/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javanotesprofessional;

import com.mycompany.javanotesprofessional.OOP.Person;
import com.mycompany.javanotesprofessional.OOP.Velocity;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JOHN
 */



public class JavaNotesProfessional {

    public static void main(String[] args) {
        //formato de numeros
        Locale locale = Locale.forLanguageTag("es-COL");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String result_ = numberFormat.format(1099.90);
        
        System.out.println(result_);
        
        NumberFormat procentaj = NumberFormat.getPercentInstance();
        System.out.println(procentaj.format(0.34));
        
        //input uotput
        Scanner scanner = new Scanner(System.in);
        
        // Object Velocity
        Velocity velocity = new Velocity();
        
        /*
            Ej 1: Un auto se mueve a una velocidad uniforme de 30 m/s ¿Qué distancia recorrera en 20 segundos?
        
        */
        
        velocity.setSpeedy(30);
        velocity.setTime(20);
        System.out.println("The distance traveled in " + velocity.getTime() + "is: " + velocity.getDistanceTraveled() + "m");
        
        /*
        
            Ej 2: Alex juega con una pelota que se mueve uniformemente sobre el piso a una velocidad de 3 m/s
            calcular el tiempo que la pelota tardara en recorrer 12 m
        */
        
        velocity.setSpeedy(3);
        velocity.setDistance(12);
        velocity.calculateTimeTravel();
        System.out.println("Time to travel for " + velocity.getDistance() + "m is: " + velocity.getTime() + " segundos");
        
        /*
        
        */
        
    }
}
