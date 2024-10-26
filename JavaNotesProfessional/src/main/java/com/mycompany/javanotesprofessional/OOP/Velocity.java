/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javanotesprofessional.OOP;

/**
 *
 * @author JOHN
 */
public class Velocity {
    private int speed;
    private int distance;
    private int time;
    private String distanceUnit;
    private String timeUnit;

    public Velocity() {
    }
    
    public void calculateTimeTravel(){
        this.time = (this.distance / this.speed);
    }
            
    public int getDistanceTraveled(){
        int result = this.speed * this.time;
        return result;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeedy(int speed) {
        this.speed = speed;
    }
    
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    
    
}
