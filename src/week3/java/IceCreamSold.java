/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3.java;

import java.io.*;


/**
 *
 * @author Alex
 */
public class IceCreamSold {
    
    private static int iceCreamSales = 0;
    private String FavIceCream = "";
    private String[]totalSales;
    
    IceCreamSold(String filename){
        try{
            totalSales = ReadFile("icecream.dat");
            iceCreamSales = totalSales.length;
        }
        catch(IOException e){
            System.err.println(e);
            System.exit(1);
        }
    }
    
    public static String[] ReadFile(String filename) throws IOException{
        File inFile = new File(filename);
        BufferedReader bin = null;
        String fileReading ="";
        String[]sales = null;

        try{
            FileReader fin = new FileReader(inFile);
            bin = new BufferedReader(fin);
            String line = bin.readLine();
            while(line != null){
                fileReading+= line + "\n";
                line = bin.readLine();
            }
            sales = fileReading.split("\n");
            
            return sales;

            
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }
        finally{
            if(bin !=null){bin.close();}
        }
       return sales;
    }
    
    public String getSales(){
        String sales = "";
        
        for(String x: totalSales){
            sales += x + "\n";
        }
        
        return sales;
    }
    
    public String numberOfSales(){
        String total = "";
        
        total = "The total number of sales are: " + iceCreamSales;
        
        return total;
    }
    
    public String TypeOfIceCreamSold(String icecream){
        String output ="";
        int numberSold = checkHowMany(icecream);
        
        if(numberSold ==0){
            return output ="Sorry none of those where sold!";
        }
        
        output = "The number of " +icecream +" Sold was: " 
                +numberSold;
        
        return output;
    }
    
    public int getTotalSales(){
        return iceCreamSales;
    }
    
    public String percentIceSale(String icecream){
        String output = "";
        int sales = checkHowMany(icecream);
        int totalSales = getTotalSales();
        float percent =(float)((sales *100) / totalSales);
        
        output = "The percentage of " +icecream +" sold was: " +percent +"%";
        
        return output;
    }
    
    private int checkHowMany(String icecream){
        int numberSold = 0;
        
        for(String x: totalSales){
            if(x.equals(icecream)){
                numberSold++;
            }
        }
        
        return numberSold;
    }
    
    
    public static void main(String[]args){
        IceCreamSold ic = new IceCreamSold("icecream.dat");
        
        System.out.println(ic.getSales());
        System.out.println(ic.numberOfSales());
        System.out.println(ic.TypeOfIceCreamSold("Strawberry"));
        System.out.println(ic.percentIceSale("Strawberry"));
    }
}



