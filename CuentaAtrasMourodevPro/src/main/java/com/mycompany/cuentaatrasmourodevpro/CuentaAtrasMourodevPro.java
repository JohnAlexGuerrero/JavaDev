/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentaatrasmourodevpro;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;



/**
 *
 * @author JOHN
 */

/*
 * EJERCICIO:
 * ¡El 12 de noviembre lanzo mouredev pro!
 * El campus de la comunidad para estudiar programación de
 * una manera diferente: https://mouredev.pro
 *
 * Crea un programa que funcione como una cuenta atrás.
 *
 * - Al iniciarlo tendrás que indicarle el día, mes, año,
 *   hora, minuto y segundo en el que quieres que finalice.
 * - Deberás transformar esa fecha local a UTC.
 * - La cuenta atrás comenzará y mostrará los días, horas,
 *   minutos y segundos que faltan.
 * - Se actualizará cada segundo y borrará la terminal en
 *   cada nueva representación del tiempo restante.
 * - Una vez finalice, mostrará un mensaje.
 * - Realiza la ejecución, si el lenguaje lo soporta, en
 *   un hilo independiente.
 */
public class CuentaAtrasMourodevPro {

    public static void main(String[] args) {
        Calendar dateFinish = Calendar.getInstance();
        
        String dateFinishStr = "11/11/2024 17:30:00";
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf.setTimeZone(TimeZone.getDefault());
        
        try{
            Date date = sdf.parse(dateFinishStr);
            dateFinish.setTime(date);
            dateFinish.setTimeZone(TimeZone.getTimeZone("UTC"));
            System.out.println("Fecha de finalizacion parseada correctamente en UTC");
            
        }catch (Exception e){
            System.out.println("Error al parsear la fecha");
        }
        
        Thread countdownThread = new Thread(()->countDown(dateFinish));
        countdownThread.start();
        
    }
    
    public static void countDown(Calendar dateFinish){
        while(true){
            Calendar dateCurrently = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            long diffTime = dateFinish.getTimeInMillis() - dateCurrently.getTimeInMillis();
            
            if(diffTime <= 0){
                System.out.println("La cuenta atras a finalizado...!");
                break;
            }
            
            long days = TimeUnit.MILLISECONDS.toDays(diffTime);
            long hours = TimeUnit.MILLISECONDS.toHours(diffTime);
            long minutes = TimeUnit.MICROSECONDS.toMinutes(diffTime);
            long seconds = TimeUnit.MICROSECONDS.toSeconds(diffTime);
            
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            System.out.printf("Faltan %02d días, %02d horas, %02d minutos y %02d segundos.%n", days, hours, minutes, seconds);
            
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            
        }
    }
}
