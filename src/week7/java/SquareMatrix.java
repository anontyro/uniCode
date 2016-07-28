/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.java;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class SquareMatrix {

    //private two-dimensional array declared
    private int[][] squareMatrix;
    //values for both the rows and columns
    private int numberOfRows;
    private int numberOfColumns;

    /**
     * Two argument constructor that takes the values to build the
     * two-dimensional array to, must be equal as this is a SquareMatrix.
     *
     * @param numberOfRows int value for number of rows.
     * @param numberOfColumns int value for number of columns.
     */
    public SquareMatrix(int numberOfRows, int numberOfColumns) {
        //if square will construct
        if (numberOfRows == numberOfColumns) {
            //assign the variable to the class variables
            this.numberOfRows = numberOfRows;
            this.numberOfColumns = numberOfColumns;
            //create the squareMatrix object of the size given
            squareMatrix = new int[numberOfRows][numberOfColumns];
        } else { //if not square
            System.out.println("This is not a square matrix, both rows and columns \n"
                    + "must be the same, try again");
            System.exit(1); //exit the program to prevent errors for a non-square array
        }
    }

    /**
     * setter method to set the value of a specific cell in the two dimensional
     * array.
     *
     * @param row int value for the selected row.
     * @param column int value for the selected column.
     * @param value int value for the value to add to the two dimensional array
     */
    public void setValue(int row, int column, int value) {
        squareMatrix[row][column] = value;
    }

    /**
     * method to select a row and add an array that matches the size of the row.
     * will throw errors if rowNo exceeds avaliable rows or array exceeds space.
     *
     * @param rowNo int row to add the values to.
     * @param row int[] to add into the two-dimensional array
     */
    public void addRow(int rowNo, int[] row) {
        //checks to see if the rowNo exceeds the number of rows
        if (rowNo < squareMatrix.length) { 
            //checks to see if the array exceeds the number of columns
            if (row.length == squareMatrix.length) {
                //for loop to add the content to the selected row
                for (int i = 0; i < squareMatrix.length; i++) {
                    squareMatrix[rowNo][i] = row[i];
                }
            } else { //if array is too big
                System.out.println("Sorry the array to add does not match the size"
                        + " of the row avaliable, try again");
            }
        } else { //if row is out of bounds
            System.out.println("rowNo exceeds the number of rows avaliable");
        }
    }

    /**
     * method to calculate the second diagonal for the square matrix.
     * @return int value for the second Diagonal
     */
    public int SecondDiagonal() {
        int sum = 0;

        for (int i = 0; i < numberOfRows; i++) {
            sum += squareMatrix[i][squareMatrix.length - (i + 1)];
        }

        return sum;
    }

    /**
     * toString method that will print out the matrix on the console.
     * @return the dimensions rxc and the matrix
     */
    @Override
    public String toString() {
        String output = "The Square Matrix is " + numberOfRows + " by " + numberOfColumns
                + "\n";

        //for loop to print out the two-dimensonal array
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                output += squareMatrix[i][j] + ", ";
            }
            output += "\n"; //adds a new line
        }

        return output;
    }
    
        public static void main(String[] args) {
        
        //create first object
        SquareMatrix sqMx = new SquareMatrix(3, 3);
        int[] row = {10, 20, 11};
        int[] row1 = {9, 8, 31};
        int[] row2 = {2, 16, 24};
        sqMx.addRow(0, row);
        sqMx.addRow(1, row1);
        sqMx.addRow(2, row2);

        System.out.println(sqMx.toString());
        System.out.println("Second Diagonal: " +sqMx.SecondDiagonal()+"\n");
        
        //create second object
        SquareMatrix sqMx2 = new SquareMatrix(4, 4);
        int[] rowX = {41, 19, 1, 8};
        int[] rowY = {10, 6, 44, 65};
        int[] rowZ = {8, 21, 11, 71};
        int[] rowW = {7, 5, 21, 10};

        sqMx2.addRow(0, rowX);
        sqMx2.addRow(1, rowY);
        sqMx2.addRow(2, rowZ);
        sqMx2.addRow(3, rowW);

        System.out.println(sqMx2.toString());
        System.out.println("Second Diagonal: " +sqMx2.SecondDiagonal()+"\n");
        
        //create thrid object
        SquareMatrix sqMx3 = new SquareMatrix(4,6);
    }

}
