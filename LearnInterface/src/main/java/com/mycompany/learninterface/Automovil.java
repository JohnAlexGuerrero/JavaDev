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
public class Automovil implements Transporte{

    public Automovil() {
    }
    
    @Override
    public String arrancar(){
        return "arrancar";
    }

    @Override
    public String detener() {
        return "detener";
    }

    @Override
    public String velocidadActual() {
        return "30 m/s";
    }
    
}
