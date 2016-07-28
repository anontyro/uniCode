/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.java;

/**
 *
 * @author Alex
 */
public class Test {

    private int count;                              // Number of numbers that have been entered.  
    private double sum;                         // The sum of all the items that have been entered.
    private double squareSum;             // The sum of the squares of all the items.

    /**
     * Add a number to the dataset. The statistics will be computed for all the
     * numbers that have been added to the dataset using this method.
     *
     * @param num
     */
    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num * num;
    }

    /**
     * Return the number of items that have been entered into the dataset.
     *
     * @return
     */
    public int getCount() {
        return count;
    }

    /**
     * Return the sum of all the numbers that have been entered.
     *
     * @return
     */
    public double getSum() {
        return sum;
    }

    /**
     * Return the average of all the items that have been entered. The return
     * value is Double.NaN if no numbers have been entered.
     *
     * @return
     */
    public double getMean() {
        return sum / count;
    }

    /**
     * Return the standard deviation of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     *
     * @return
     */
    public double getStandardDeviation() {
        double mean = getMean();
        return Math.sqrt(squareSum / count - mean * mean);
    }

        public static void main(String[] args) {
        StatCalc myStatCalc = new StatCalc();
        
        // Put all of our integers into an array
        int[] numberList = {5,7,12,23,3,2,8,14,10,5,9,13};
        
        // Loop through the entire array and add each number using myStatCalc.enter() method
        for (int i = 0; i < numberList.length; i++){
            myStatCalc.enter(numberList[i]);
        }
        // Get the sum using the sum getter method in the class
        double sum = myStatCalc.getSum();
        // Get the mean using the mean getter method in the class
        double mean = myStatCalc.getMean();
        // Get the standard deviation using the getter method in the class
        double standardDeviation = myStatCalc.getStandardDeviation();
        
        // Output the return results form the getter methods
        System.out.println("The Sum is: " + sum);
        System.out.println("The Mean is: " + mean);
        System.out.println("The Standard Deviation is: " + standardDeviation);
        
    }
        
}
