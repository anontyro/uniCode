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
public class MatchBox  extends Box {  

    private String getVolume;
//Calls the Box class.
    
            
    MatchBox() {    //MatchBox object
    }
    
    MatchBox(double w, double h, double d) {
        super(w, h, d);
        
        }
    
    MatchBox(double w, double h, double d, double k) {
        super(w, h, d, k);
    }

/**
 * Returns the results for Width, Height, Depth, Volume, and Weight.
  */  
    public static void main(String[] args) {
        // TODO code application logic here
        MatchBox sampleBox = new MatchBox(3, 10, 3);
        MatchBox sampleBox2 = new MatchBox(3, 10, 3, .03611);
        System.out.println("width of MatchBox is " + sampleBox.width);
        System.out.println("height of MatchBox is " + sampleBox.height);
        System.out.println("depth of MatchBox is " + sampleBox.depth);
        sampleBox.getVolume();
        sampleBox2.calculateWeight();
        
    }

 }