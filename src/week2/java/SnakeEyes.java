/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.java;

/**
 *
 * @author Alex
 */
public class SnakeEyes {
    
    private String output = "";
    private int die = 0;
    
    public SnakeEyes(){
        
    }
    
    public int rollDie(){
        
        die = (int)(Math.random()*6)+1;
               
        return die;
    }
    
    public String rollUntil(int stop){
        
        while(rollDie() != stop){
            output += "\n" + rollDie();
        }
        
        return output;
    }
    
    public String rollTwoDice(int stop){
        
        int die1 = 0;
        int die2 = 0;
        boolean roll = true;
        int i = 0;
        
        while(roll == true){
            die1 = rollDie();
            die2 = rollDie();
            output += "\n" + die1 + " " + die2;
            i ++;
            
            if(die1 ==stop && die2 ==stop){
                roll = false;
            }
        }
        output += "\n" + "The dice have been rolled " + i + " times to reach"
                + stop;
        
        return output;
    }
    
    public static void main(String[]args){
        SnakeEyes die1 = new SnakeEyes();
        SnakeEyes die2 = new SnakeEyes();
        
        
        System.out.println(die1.rollTwoDice(1));
    }
    
}
