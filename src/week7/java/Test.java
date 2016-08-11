/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.java;

/**
 *
 * @author Alex
 */
public class Test {

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
        System.out.println("Second Diagonal: " + sqMx.SecondDiagonal() + "\n");

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
        System.out.println("Second Diagonal: " + sqMx2.SecondDiagonal() + "\n");

        //create thrid object
        SquareMatrix sqMx3 = new SquareMatrix(4, 6);
    }
}
