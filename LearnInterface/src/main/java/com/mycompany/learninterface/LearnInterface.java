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
    Es una forma de declarar métodos que deben ser implementados por las clases,
    sin definir el comportamiento de esos métodos.

    Las interfaces son fundamentales en la programación orientada a objetos para garantizar que
    diferentes clases sigan una estructura común sin importar cómo implementen el código interno.

    Syntax:
        interface InterfaceName {
        // Abstract method
        void methodName();

        // Constant
        int CONSTANT_VALUE = 100;
    }

    Example:
        interface Animal {
        void sound(); // Abstract method
        void eat();   // Abstract method
    }

    Functional Interface
    A functional interface is an interface with only one abstract method.
    Java 8 introduced lambda expressions, which make functional interfaces concise and easy to use.
    Functional interfaces can also have multiple default or static methods.

    Example:

    @FunctionalInterface
    interface Calculator{
        int add(int x, int y);
    }

    Maker Interface

    A marker interface is an empty interface (without methods or fields).
    It is used to signal the Java runtime or other code to treat the objects of the implementing class
    in a special way.

    Example:

    - `Serializable`: Marks a class as serializable.

    - `Cloneable`: Marks a class as capable of being cloned.

    Syntax:
        class ClassName implements InterfaceName {
            @Override
            public void methodName() {
                // Implementation of the method
            }
        }

    Ouput
        interface Animal {
            void sound();
            void eat();
        }

        class Dog implements Animal {
            @Override
            public void sound() {
                System.out.println("Dog barks");
            }

            @Override
            public void eat() {
                System.out.println("Dog eats");
            }
        }

        public class Main {
            public static void main(String[] args) {
                Dog dog = new Dog();
                dog.sound();
                dog.eat();
            }
        }

    A functional interface is an interface with a single abstract method. Functional interfaces can have any number of default or static methods, but they can only have one abstract method. These interfaces are the foundation for lambda expressions in Java.

    Key Functional Interfaces in Java:

    - Runnable: Represents a task to be executed by a thread.

    - Callable: Represents a task that returns a result.

    - Comparator: Represents a comparison function, which compares two objects.

    - Supplier, Consumer, Predicate, and Function: Used in Java’s functional programming paradigm.

    Example Using a Functional Interface:

    @FunctionalInterface
    interface Greeting {
        void sayHello();
    }

    public class Main {
        public static void main(String[] args) {
            // Using a lambda expression to implement the interface
            Greeting greeting = () -> System.out.println("Hello, World!");
            greeting.sayHello();
        }
    }

    Output:

    Hello, World!

    Use Cases of Interfaces

    - Defining APIs: Interfaces are often used to define APIs in frameworks,
     such as Java’s Collection Framework.

    - Multiple Inheritance: Java doesn’t support multiple inheritance for classes,
     but a class can implement multiple interfaces, allowing for multiple inheritance of behaviors.

    - Callback Mechanisms: Interfaces are often used in event-driven programming
     (e.g., listeners in GUI frameworks like Swing and Android).

    - Polymorphism: Interfaces enable polymorphism, allowing different objects to be treated
    as instances of the interface type, improving code flexibility
    .
    Example of Multiple Inheritance via Interfaces:

    interface Printable {
        void print();
    }

    interface Showable {
        void show();
    }

    class Demo implements Printable, Showable {
        @Override
        public void print() {
            System.out.println("Printing...");
        }

        @Override
        public void show() {
            System.out.println("Showing...");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Demo obj = new Demo();
            obj.print();
            obj.show();
        }
    }

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
