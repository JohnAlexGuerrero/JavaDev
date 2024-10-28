/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learninterface;

import com.mycompany.learninterface.LearnInterface.Operaciones;

/**
 *
 * @author JOHN
 */
public class Calculadora implements Operaciones{

    public Calculadora() {
    }
    
    @Override
    public int suma(int a, int b){
        return a + b;
    }
    
    @Override
    public int resta(int a, int b){
        return a - b;
    }
    
}
