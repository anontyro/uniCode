
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alex
 */
public class Test {
     
    public static void main(String[]args){
        Date date1 = new Date();
        Date date2 = new Date();
        
        System.out.println((date1 ==date2) + " " +(date1.getClass()==date2.getClass()));
        
        
    }
}