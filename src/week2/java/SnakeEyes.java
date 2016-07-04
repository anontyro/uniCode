
package week2.java;

import java.util.ArrayList;

/**
 * Simple class that will preform functions recording the results from two dice
 * @author Alex
 */
public class SnakeEyes {
    
    private String output = "";
    private int die = 0;
    
    /**
     * no argument constructor used to make a SnakeEyes object
     */
    public SnakeEyes(){
        
    }
    
    /**
     * a no argument method that simulates a single die roll using a pseudo random number
     * generator to roll a six sided dice
     * @return die as an int after it is rolled
     */
    public int rollDie(){
        
        die = (int)(Math.random()*6)+1;
               
        return die;
    }
    
    /**
     * rollTwoDice is a method that takes one argument, when both the dice hit 
     * this number together the method terminates and prints out the final result
     * stating how many rolls it has taken to reach both dice rolling this number
     * @param stop int defines the number both dice must roll to end the method
     * from 1 - 6
     * @return returns the output string of dice rolls along with a final output
     * that states how many times the dice has been rolled
     */
    public String rollTwoDice(int stop){
        output = "";
        int die1 = 0;
        int die2 = 0;
        boolean roll = true;
        int i = 0;
        
        while(roll == true){
            die1 = rollDie();
            die2 = rollDie();
            if(output.equals("")){
                output = die1 +" " + die2;
                i++;
            }
            output += "\n" + die1 + " " + die2;
            i ++;
            
            if(die1 ==stop && die2 ==stop){
                roll = false;
            }
        }
        output += "\n" + "The dice have been rolled " + i + " times to reach "
                + stop;
        
        return output;
    }
    
    /**
     * rollTwoDice is an overloaded method that takes two variables instead of
     * one in the previous method, it takes the standard stop int which tells the
     * method what number we are looking for on both dice, it also takes the
     * numberOfThrows which defines how many times the dice will be thrown to
     * and outputs a count of how many times this number appeared over this many
     * throws
     * @param stop int is the number that both dice must hit to record the value
     * @param numberOfThrows int defines how many times you want to throw two dice
     * @return returns a string that tells you how many times the number has been
     * rolled across however many tries
     */
    public String rollTwoDice(int stop, int numberOfThrows){
        
        int die1 = 0;
        int die2 = 0;
        int numberCount = 0;
        
        
        for(int i = 0; i < numberOfThrows; i++){
            die1 = rollDie();
            die2 = rollDie();
            
            if(die1 == stop && die2 ==stop){
                numberCount++;
            }
        }
        return output = "The number of times both dice showed " + stop 
                + " over: " + numberOfThrows + " is: " + numberCount;
    }
    
    public String rollDice(int numberOfThrows, int numberOfDice){
        int numberCount = 0;
        output ="";
        ArrayList<Integer>dice = new ArrayList<>(numberOfDice);
        
        for(int i = 0; i < numberOfThrows; i++){
            output +="For the " + (i+1) + " throw the rolls across " + numberOfDice +
                        " are: \n";
            for(int x:dice){
                x = rollDie();
                output += x +"\n";
            }    
        }
        return output;
    }
    
    /*
    The main method used to test the above class
    */
    public static void main(String[]args){
        SnakeEyes die1 = new SnakeEyes(); //new object created to use above methods
        
        /* 
        will output to console dice rolling looking for snake eyes over 1000 tries
        it will record how many times said number is rolled in this case snake eyes
        */
        for(int i = 0; i < 5; i++){
            System.out.println(die1.rollTwoDice(1, 1000));
        }
        /*
        this calls the method to rollTwoDice looking for snakeeyes and will terminate
        on reaching snake eyes
        */
        for(int i = 0; i < 5; i++){
            System.out.println(die1.rollTwoDice(1));
            
        }
        
        System.out.println(die1.rollDice(5, 10));
        
        
    }
    
}
