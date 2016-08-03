/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.java;

/**
 *
 * @author Alex
 */
public class Box {

    public double width;
    public double height;
    public double depth;
    public double weight;

    // This is an empty constructor
    public Box() {
        ;
    }

    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
       Box(double w, double h, double d, double k){
       width = w;
       height = h;
       depth = d;
       weight = k;
   }

    public void getVolume() {
        System.out.println("Volume is : " + width * height * depth);
    }
    
       void calculateWeight() {
        System.out.println("Weight is : " + width * height * depth * weight + " pounds\n");
   }
    
}
