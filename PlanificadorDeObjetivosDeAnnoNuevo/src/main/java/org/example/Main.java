package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static List<Goal> goals = new ArrayList<>();
    static final Scanner scanner = new Scanner(System.in);
    static HashMap<String, List<Goal>> plan;
    static String [] months = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    public static void showMenu(){
        System.out.println("Planificador de Objetivos");
        System.out.println("1. Añadir Objetivo");
        System.out.println("2. Calcular el plan detallado");
        System.out.println("3. Guardar la planificación");
        System.out.println("4. Salir");
    }

    public static Goal requestGoal(){
        System.out.println("Meta: ");
        String goalName = scanner.nextLine();
        int amount = 0;
        int limit;

        while (amount == 0){
            System.out.println("Cantidad:");
            try {
                amount = Integer.parseInt(scanner.nextLine());
                if(amount < 0){
                    System.out.println("La cantidad debe ser un numero positivo");
                    continue;
                }
                break;
            }catch (Exception e){
                System.out.println("Por favor, introduce un número válido");
            }
        }

        System.out.println("Unidad: ");
        String unit = scanner.nextLine();

        while(true){
            try {
                System.out.println("Plazo en meses (máximo 12): ");
                limit = Integer.parseInt(scanner.nextLine());

                if (limit <= 0 || limit > months.length){
                    System.out.println("El plazo debe ser un número entre 1 y 12 (meses)");
                    continue;
                }
                break;

            }catch (Exception e){
                System.out.println("Por favor, introduce un número entre 1 y 12 (meses)");
            }
        }
        return new Goal(goalName, amount, unit,limit);
    }

    public static void calculateDetailedPlan(List<Goal> goals){
        plan = new HashMap<>();

        Map<Integer, List<Goal>> mapPlan = goals.stream()
                .collect(Collectors.groupingBy(Goal::getLimit));

        for (int i=0; i < mapPlan.size(); i++){
            List <Goal> goalList = new ArrayList<>();

            for (Integer j: mapPlan.keySet()){
                goalList.addAll(mapPlan.get(j));
                for(int k=0; k < j; k++){
                    plan.put(months[k], goalList);
                }
            }
        }
    }

    public static void showDetailedPlan(HashMap<String, List<Goal>> plan){
        //Mostrar la planificación de objetivos por mes
        for (String m: months) {
            System.out.println(m + ":");
            for(Goal g: plan.get(m)){
                for (int i=0; i < plan.get(m).size(); i++){
                    System.out.println(
                            "[]" + (i+1) + ". " + g.getTitle() + " ("+ g.getUnitByMonth() + " " + g.getUnits() + "/mes). Total: " + g.getAmount() + "."
                    );
                }
            }
        }
    }

    public static void saveDetailedPlan(HashMap<String, List<Goal>> plan){
        // Guardar la planificación en archivo txt
        try {
            File fileData = new File("planificacion.txt");
            if(fileData.createNewFile()){
                FileWriter fileWriter = new FileWriter(fileData.getPath());
                for (String m: months) {
                    fileWriter.write(m + "\n");
                    for(Goal g: plan.get(m)){
                        for (int i=0; i < plan.get(m).size(); i++){
                            fileWriter.write(
                                    "[]" + (i+1) + ". " + g.getTitle() + " ("+ g.getUnitByMonth() + " " + g.getUnits() + "/mes). Total: " + g.getAmount() + ".\n"
                            );
                        }
                    }
                }
                fileWriter.close();
                System.out.println("fichero: " + fileData.getName() + " creado");
                System.out.println(fileData.getPath());
            }else{
                System.out.println("No se ha podido crear el fichero.");
                System.out.println(fileData.getPath());
            }
        }catch (IOException error){
            System.out.println("Error de creacion de fichero.");
            error.printStackTrace();
        }
    }

    public static void main(String[] args) {
        while (true){
            showMenu();
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    // permitir añadir solo 10 objetivos como maximo
                    if(goals.size() > 10){
                        System.out.println("Solo es permitido máximo 10 Objetivos");
                        System.out.println("Debes eliminar " + (goals.size() - 10));
                    }else{
                        Goal goal = requestGoal();
                        goals.add(goal);
                        System.out.println("Objetivo añadido con éxito.");
                        System.out.println("Total Objetivos: " + goals.size());
                    }
                    break;
                case 2:
                    if (goals.size() == 0){
                        System.out.println("No hay objetivos añadidos.");
                    }else{
                        calculateDetailedPlan(goals);
                        showDetailedPlan(plan);
                    }
                    break;
                case 3:
                    if (goals.size() == 0){
                        System.out.println("No hay objetivos añadidos.");
                    }else{
                        saveDetailedPlan(plan);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del planificador.");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Opción inválida. Elige una opción entre 1 y 4.");

            }
        }

/*
        // Cada objetivo tiene un plazo maximo de 12 meses
        boolean anyHaveTimeMaxTwelveMonths = goals.stream()
                .anyMatch(e -> e.getLimit() > 12);

        if(anyHaveTimeMaxTwelveMonths){
            System.out.println("existe un objetivo con plazo mayor a 12 meses.");
            System.out.println("revisa el plazo de tus objetivos.");
            System.exit(1);
        }

 */
    }


    static class Goal{
        private String title;
        private int amount;
        private String units;
        private int limit;

        public Goal(String title, int amount, String units, int limit) {
            this.title = title;
            this.amount = amount;
            this.units = units;
            this.limit = limit;

        }

        public String getTitle() {
            return title;
        }

        public int getAmount() {
            return amount;
        }

        public String getUnits() {
            return units;
        }

        public int getLimit() {
            return limit;
        }

        // calcular el numero de unidades aplicadas en cada mes
        public int getUnitByMonth(){
            if(this.amount == this.limit) return (this.amount / this.limit);
            if(this.amount < this.limit) return 1;
            if(this.amount > this.limit) {
                var resM = Math.round((float) this.amount / this.limit);
                var resU = this.amount % this.limit;
                //System.out.println("r:"+resU);
                if(resU == 0) return resM;
                return resM;
            }

            return 3;
        }

        // cada objetivo debe poseer un nombre, la cantidad de unidades a completar y su total
        @Override
        public String toString() {
            return "";
        }
    }

}