package org.example;

import org.example.models.Activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Activity> activities = new ArrayList<>();
    public static int option = 0;
    public static void menu(){
        System.out.println("1. crear actividad.");
        System.out.println("2. listar actividades.");
        System.out.println("3. completar actividad.");
        System.out.println("4. exit.");
        System.out.println("Elige una opcion: ");
    }

    public static Activity formActivity(){
        int id = activities.size() + 1;
        System.out.println("Nombre: ");
        String title = scanner.next();
        return new Activity(id, title);
    }

    public static Activity activityComplete(){
        System.out.println("Actividad ID: ");
        int id = scanner.nextInt();
        Activity activity = activities.get(id - 1);
        return activity;
    }

    public static void showActivities(){
        for (int i=0; i< activities.size(); i++) System.out.println(1+i + " " + activities.get(i));
    }

    public static void main(String[] args) {

        while(true){
            menu();
            option = scanner.nextInt();

            switch(option){
                case 1:
                    Activity activity = formActivity();
                    activities.add(activity);
                    break;
                case 2:
                    if (activities.size() == 0){
                        System.out.println("No hay actividades para listar.");
                    }else{
                        showActivities();
                    }
                    break;
                case 3:
                    try {
                        Activity activity1 = activityComplete();
                        if (activity1.isCompleted()) {
                            System.out.println("Esta actividad ya esta completada.");
                        }else{
                            activity1.setCompleted(true);
                            System.out.println("La actividad: " + activity1.getTitle() + " fue completada con exito.");
                        }

                    }catch (Exception e){
                        System.out.println("No existe ID.");
                    }
                    break;
                case 4:
                    System.out.println("Esta saliendo del sistema.");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Opcion no disponible.");
            }
        }


    }
}