/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solidprinciple;

import java.util.ArrayList;

/**
 *
 * @author JOHN
 */
public class Library {
    ArrayList <User> users = new ArrayList<User>();
    ArrayList <Book> books = new ArrayList<Book>();
    ArrayList <BookLoan> loans = new ArrayList<BookLoan>();

    public Library() {
    }
    
    //add of users
    public void addUser(User user){
        users.add(user);
    }
    
    //add books
    public void addBook(Book book){
        books.add(book);
    }
    
    //add loan
    public void addLoan(BookLoan bookLoan){
        loans.add(bookLoan);
    }
    
    
    
}
