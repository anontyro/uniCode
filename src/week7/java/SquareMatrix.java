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

    private int[][] squareMatrix;
    private int numberOfRows = 0;
    private int numberOfColumns = 0;

    public SquareMatrix(int numberOfRows, int numberOfColumns) {
        if (numberOfRows == numberOfColumns) {
            this.numberOfColumns = numberOfColumns;
            this.numberOfRows = numberOfRows;
            squareMatrix = new int[numberOfRows][numberOfColumns];
        }
        System.err.println("This is not a square matrix, try again");
        System.exit(1);
    }

    public SquareMatrix() { //testing constructor
        int[][] squareMatrix = {{2, 5, 8},
                                {6, 6, 1},
                                {4, 7, 0}
                                };
        this.squareMatrix = squareMatrix;
        numberOfRows = 3;
        numberOfColumns = 3;
        System.out.println(squareMatrix[2][1]);
    }

    public void addToMatrix(int row, int column, int value) {
        squareMatrix[row][column] = value;
    }
    
    public int SecondDiagonal(){
        int sum = 0;
        
        for(int i = 0; i <numberOfRows;i++){
            System.out.println(squareMatrix[i][squareMatrix.length-(i+1)]);
            sum +=squareMatrix[i][squareMatrix.length-(i+1)];
        }
        
        return sum;
    }

    public String toString() {
        String output = "The Square Martix is " + numberOfRows + " by " + numberOfColumns
                + "\n";
        
        for(int i = 0; i < squareMatrix.length;i++){
            for(int j = 0; j < squareMatrix[i].length;j++){
                output+= squareMatrix[i][j] + "";
            }
            output += "\n";
        }

        return output;
    }

}
