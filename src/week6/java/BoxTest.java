/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.java;

/**
 * Matchbox extends Box and extends some of its components
 */
public class BoxTest extends Box {
    //variables for this class
    private double weight = 0;
    private double volume = 0.0;  
    private final double WEIGHT_OF_WATER = 0.03611;

    //constructor that exends the box constructor 
    public BoxTest(double w, double h, double d) {
        super(w, h, d); //sets the values in the superclass to be called later

    }

    /*
    method that overrides the original found in Box due to the same method signature
    however produces more comprehenisve output.
    
    */
    @Override
    public void getVolume() {
        double volume = height * width * depth;
        this.volume = volume;

        //construction of a string to print out the values needed
        System.out.println("width of MatchBox is " + width + "\n"
                + "height of MatchBox is " + height + "\n"
                + "depth of MatchBox is " + depth);
        calculateWeight(); //method call to return the weight output needed
        System.out.println("Volume is " + volume);// volume printed at the end
        
    }

    //method to calculate teh weight using a water density of 0.03611
    public void calculateWeight() {

        double weight = WEIGHT_OF_WATER * volume;
        this.weight = weight;
        System.out.println("weight of MatchBox is " + weight);
    }


    //testing class
    public static void main(String[] args) {

        BoxTest mb = new BoxTest(5, 10, 3); //creating the matchbox object
        mb.getVolume(); //returning the values

    }

}
