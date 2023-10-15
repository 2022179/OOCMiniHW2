/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Primm
 */
public interface Driveable {
    public void accelerate(float speed);
    public void brake();
    public void turn(float angle);
    public float getDirection(); 
    public float getSpeed();   
    public String getMake();    
    public String getType();
}
//Define the flyable interface that extended drivaable
interface Flyable extends Driveable{
    void changeAltitude(float change);
    float getAltitude();
}

interface Sailable extends Driveable {
    void setSailDirection(float angle);
    float getSailDirection();
}