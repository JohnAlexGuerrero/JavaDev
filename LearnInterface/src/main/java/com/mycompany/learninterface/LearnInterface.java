/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.learninterface;

import com.mycompany.learninterface.LearnInterface.Operaciones;

/**
 *
 * @author JOHN
 */
/*
En Java, una interfaz define un contrato que las clases que la implementen deben seguir. 
Es una forma de declarar métodos que deben ser implementados por las clases, sin definir el comportamiento de esos métodos. 
Las interfaces son fundamentales en la programación orientada a objetos para garantizar que diferentes clases sigan una 
estructura común sin importar cómo implementen el código interno.
*/

public class LearnInterface {

    /*
        Una interfaz en Java se declara con la palabra clave interface y contiene 
        solo la firma de los métodos (es decir, los nombres y parámetros), 
        pero no la implementación de los mismos. 
        Las clases que implementan una interfaz están obligadas a proporcionar 
        una implementación para cada método definido en la interfaz.
    */
        
    public interface Operaciones{
        //metodo abstracto
        int suma(int a, int b);
        int resta(int a, int b);
    }
    public interface Transporte{
        String arrancar();
        String detener();
        String velocidadActual();
    }
    
    public static void main(String[] args) {
        Operaciones calc = new Calculadora();
        
        System.out.println("Suma: " + calc.suma(5,3));
        System.out.println("Resta: " + calc.resta(5,3));
        /*
        Beneficios de Usar Interfaces

        Abstracción: Las interfaces permiten que diferentes clases implementen la misma
        estructura de métodos, pero con su propia lógica interna.
        
        Flexibilidad y desacoplamiento: El uso de interfaces facilita la escritura de código flexible
        y desacoplado, ya que las clases pueden cambiar sus implementaciones sin afectar
        al resto del código.
        
        Polimorfismo: Las interfaces permiten que múltiples clases sean tratadas de la misma manera,
        independientemente de cómo implementen los métodos.
        
        */
        
        /*
        Retos Propuestos

        Reto 1: Crea una interfaz "Transporte"
            Define una interfaz llamada Transporte que tenga métodos
            como arrancar(), detener() y velocidadActual(). 
            Implementa dos clases que usen esta interfaz: Automovil y Bicicleta. 
            Cada clase debe tener una implementación diferente de estos métodos.
        */
        Transporte transporte = new Automovil();
        System.out.println(transporte.arrancar());
        System.out.println(transporte.detener());
        System.out.println(transporte.velocidadActual());
        
        Transporte bici = new Bicicleta();
        System.out.println(bici.arrancar());
        System.out.println(bici.detener());
        System.out.println(bici.velocidadActual());
        /*

        Reto 2: Interfaz para una tienda de videojuegos
            Crea una interfaz llamada Producto que defina los métodos getNombre(),
            getPrecio(), y comprar(). 
            Luego, implementa esta interfaz en dos clases:
            Videojuego y Consola.
            Ambos deben tener implementaciones personalizadas de estos métodos.

        Reto 3: Interfaz con herencia múltiple
            Crea dos interfaces: Comunicador 
            (con métodos enviarMensaje() y recibirMensaje()) y Almacenador
            (con métodos guardarDato() y recuperarDato()). 
            Implementa una clase llamada Smartphone que
            herede de ambas interfaces y proporcione una implementación completa de los métodos.
        */
        
    }
}
