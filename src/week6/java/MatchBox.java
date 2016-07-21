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
public class MatchBox extends Box{
    public double weight = 0;
    public double height = 0;
    public double width = 0;
    public double depth = 0;
    private final double WEIGHT_OF_WATER = 0.03611;
    
    public MatchBox(double w, double h, double d){
        super(w,h,d);
    }
    
    @Override
    public void getVolume(){
        double volume = height*width*depth;
        
    }
    
    public double calculateWright(double volume){
        double output = 0;
        
        return output;
    }
    
    public static void main(String[]args){
        
        MatchBox mb = new MatchBox(5,10,3);
        System.out.println(mb.height);
    }
    
    
}
