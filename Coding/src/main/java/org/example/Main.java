package org.example;


// #1:Identificar años bisiestos: uso del operador condicional ternario en la declaración case

public static class LeadYearChecker{
    public static String checkYear(Number year){
        return switch (year){
            case Integer y -> (y % 4 == 0 && y % 100 != 0 ) || (y % 400 == 0)?"Leap Year":"Common Year";
            default -> "Invalid Year";
        };
    }
    
    public static void main(String[] args) {
        //#1
        System.out.println(LeadYearChecker.checkYear(2000)); 
        System.out.println(LeadYearChecker.checkYear(1900)); 
        System.out.println(LeadYearChecker.checkYear(2024));
    }
}