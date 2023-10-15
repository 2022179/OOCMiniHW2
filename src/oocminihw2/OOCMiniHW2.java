/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
   public abstract class SomeVehicle implements Driveable, Flyable, Sailable {
       

        private String make;
        private String type;

        public SomeVehicle(String make, String type) {
            this.make = make;
            this.type = type;
        }
        
        @Override
        public void accelerate(float speed) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            //Implements acceleration logic for the vehicle
            
        }

        @Override
        public void brake() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //Implements braking logic for the vehicle
        }

        @Override
        public void turn(float angle) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public float getDirection() {
            return 0;
        //Implements turning logic for the vehicle
        }

        @Override
        public float getSpeed() {
           return 0; 
        //Implements speed changes logic for the vehicle
        }

        @Override
        public String getMake() {
        return make;   
        }

        @Override
        public String getType() {
            return type;
            }

        @Override
        public void changeAltitude(float change) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            // Implement altitude change logic for the flying vehicle.
            
}

        @Override
        public float getAltitude() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

      

       

       
    
}

    }
    

//

    

