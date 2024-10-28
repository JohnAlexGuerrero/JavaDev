/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learninterface;

import com.mycompany.learninterface.LearnInterface.Transporte;

/**
 *
 * @author JOHN
 */
public class Bicicleta implements Transporte{

    @Override
    public String arrancar() {
        return "a comenzar a pedalear";
    }

    @Override
    public String detener() {
        return "para para";
    }

    @Override
    public String velocidadActual() {
        return "10 m/s";
    }
    
}
