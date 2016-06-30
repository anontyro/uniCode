
package week1.java;

/**
 *
 * @author Alex
 */

import java.io.*;

public class GravityCalculator {    
    
    public static void main(String[]args){
        
        double gravity = -9.81;
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initalPosition = 1000.0;
        double finalPosition = 0.0;

        finalPosition = ((0.5 * gravity * (Math.pow(fallingTime,2))) 
                + (initalPosition*fallingTime) + initalPosition) /fallingTime ;
        
        System.out.println("The object's position after " + fallingTime +
                "seconds is " + finalPosition + "m.");

    }
    
}
