/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solidprinciple;

import java.util.Scanner;

/**
 *
 * @author JOHN
 */
public class SolidPrinciple {
    public static void showUser(User user){
        System.out.println("=============================");
        System.out.println("INFORMACION DE USUARIO");
        System.out.println("nombre: " + user.getName());
        System.out.println("id: " + user.getNumberID());
        System.out.println("email: " + user.getEmail());
        System.out.println("=============================");
    }
    
    public static void showBook(Book book){
        System.out.println("=============================");
        System.out.println("INFORMACION DE LIBRO");
        System.out.println("titulo: " + book.getTitle());
        System.out.println("autor: " + book.getAuthor());
        System.out.println("disponible: " + book.getCopiesNumber());
        System.out.println("=============================");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        
        System.out.println("Hello Library!");
        boolean flap = true;
        
        while(flap){
            System.out.println("1. registro de usuarios");
            System.out.println("2. registro de libros");
            System.out.println("3. prestamos");
            System.out.println("4. salir");
            
            byte option = scanner.nextByte();
            
            if(option == 4){
                flap = false;
            }
            
            switch(option){
                case 1:
                    System.out.println("REGISTRO DE USUARIO");
                    
                    System.out.println("Nombre:");
                    String name = scanner.nextLine();
                    
                    System.out.println("Identificador:");
                    String numberID = scanner.nextLine();
                    
                    System.out.println("email:");
                    String email = scanner.nextLine();
                    
                    User user = new User(name, numberID, email);
                    library.addUser(user);
                    showUser(user);
                    
                    break;
                case 2:
                    System.out.println("REGISTRO DE LIBRO");
                    
                    System.out.println("titulo: ");
                    String title = scanner.nextLine();
                    
                    System.out.println("Autor: ");
                    String author = scanner.nextLine();
                    
                    System.out.println("numero de copias disponibles:");
                    int copiesNumber = scanner.nextInt();
                    
                    Book book = new Book(title, author, copiesNumber);
                    library.addBook(book);
                    showBook(book);
                    break;
                case 3:
                    System.out.println("GESTION DE PRESTAMOS");
                    
                    
                    break;
                default:
                    System.out.println("La opcion no esta disponible.");
            }
        }
    }
}
