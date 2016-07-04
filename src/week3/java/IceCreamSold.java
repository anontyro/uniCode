package week3.java;

import java.io.*; //classes import for IO usage
import java.util.*;

/**
 * A simple class that reads from a file the number of ice creams sold, 
 * ice creams must be separated with a newline. This class uses its own file reading
 * method to find the data from the file
 * 
 */
public class IceCreamSold {
    
    private static int iceCreamSales = 0;
    private String[]totalSales;
    private static ArrayList<String>listOfFlavours = new ArrayList<>(10);
    private static Map<String,Integer>flavours = new HashMap<>(10);
    
    /**
    * Constructor which takes the filename to be used for the data to be read
    * to the IceCreamSold object. The constructor also catches IOExceptions
    * that may occur from not finding the files
    */
    IceCreamSold(String filename){
        //try block to setup the IceCreamSold object
        try{
            totalSales = ReadFile(filename);
            iceCreamSales = totalSales.length;            
        }
        //if there is an error it will print the message and exit
        catch(IOException e){
            System.err.println(e);
            System.exit(1);
        }
    }
    
    /**
     * The main Read class that throws an IOException if there is any issue with
     * the chosen file. This method is called in the creation of the IceCreamSold
     * object however it is also static so can be called from IceCreamSold.ReadFile(filename)
     * @param filename the filename you wish to locate to import into the object
     * it will take a string and needs a suitable suffix
     * @return returns an Array of strings which can be used to generate a rundown
     * of what the file contains
     * @throws IOException exception thrown in the finally statement which cannot
     * easily be handled within the method
     */
    public static String[] ReadFile(String filename) throws IOException{
        File inFile = new File(filename);
        BufferedReader bin = null;
        String fileReading ="";
        String[]sales = null;

        //try block for reading from the user selected file
        try{
            FileReader fin = new FileReader(inFile);
            bin = new BufferedReader(fin);
            String line = bin.readLine();
            while(line != null){
                fileReading+= line + "\n";
                
                line = bin.readLine();
            }
            //array list populated using the string fileReading
            sales = fileReading.split("\n");
            
            //add the flavours found into a map and arraylist to reference later
            for(int i = 0; i < sales.length;i++){
                int freq = 0;
                Integer testValue = flavours.get(sales[i]);
                if(testValue==null){
                    freq = 1;
                    flavours.put(sales[i], freq);
                    listOfFlavours.add(sales[i]);
                }
                else{
                    freq = testValue+1;
                    flavours.put(sales[i], freq);
                }
            }
            return sales;
        }
        //what will happen if the file cannot be accessed
        catch(IOException e){
            System.err.println(e.getMessage());
        }
        //no matter what always do this
        finally{
            if(bin !=null){bin.close();}
        }
       return sales;
    }
    
    /**
     * Get method to return a String of the sales that the file contains, each
     * element is separated by a new line
     * @return 
     */
    public String getSales(){
        String sales = "";
        
        for(String x: totalSales){
            sales += x + "\n";
        }
        return sales;
    }
    
    /**
     * This method will return the total number of sales recorded
     * @return int of the total number of sales recorded
     */
    public int numberOfSales(){
        
        return iceCreamSales;
    }
    
    /**
     * This method accepts one parameter to check how many ice cream has been 
     * sold of the user entered item
     * @param icecream string which will represent one of the ice cream
     * flavours from the list
     * @return returns an int of the total number of ice creams that match the 
     * user defined parameter
     */
    public int TypeOfIceCreamSold(String icecream){
        int numberSold = checkHowMany(icecream);
        
        return numberSold;
    }
    
    /**
     * Returns an int of the number of sales made, it does this by reading how
     * many entries are in the String Array totalsales
     * @return 
     */
    public int getTotalSales(){
        return iceCreamSales;
    }
    
    /**
     * Simple method that takes a String of what value to search for. This method
     * calls a private method that checks how many of this icecream have been sold
     * it runs through the String array and returns an int value
     * @param icecream the string name of the type of ice cream
     * @return float for what percentage of this ice cream has been sold will return
     * zero if none
     */
    public float percentIceSale(String icecream){
        int sales = checkHowMany(icecream);
        int totalSales = getTotalSales();
        
        if(sales ==0){ //to prevent any unexpected issue will retun zero if none
            return 0;
        }
        
        return (float)((sales *100) / totalSales);
    }
    
    //private method used to check how many icecream of a type exisit in the file
    private int checkHowMany(String icecream){
        int numberSold = 0;
        
        for(String x: totalSales){
            if(x.equals(icecream)){
                numberSold++;
            }
        }
        return numberSold; //returns an int value of how many
    }
    
    /**
     * This method takes no variables and will output a list of each ice cream sold
     * and how many is sold in each catagory
     * @return String with the flavour and sales on each line
     */
    public String TotalFlavourSales(){
        
        String output = "Sales broken down by category: \n";
        
        for(String x:listOfFlavours){
            output += x + " sales: " + flavours.get(x) + "\n";
        }    
        return output;
    }
    
    /**
     * generates a report of the output in a sensible manner which returns the
     * total sales with the sales reports printed on seperate lines and then
     * the total number of sales
     * @return 
     */
    @Override
    public String toString(){
        String output = "";
        output += TotalFlavourSales() +"\n"
                + "The total number of sales are: " + numberOfSales() +"\n"
                ;       
        return output;
    }
    
    /**
     * This overloaded toString method takes the ice cream you want to report on
     * as a parameter. It will print out the total sales, total number of sales
     * the number of this ice cream sold and the percentage of this ice cream
     * sold
     * @param icecream
     * @return 
     */
    public String toString(String icecream){
        String output ="";
        
        output += TotalFlavourSales() +"\n"
                + "The total number of sales are: " +numberOfSales() + "\n"
                + "The number of " + icecream + " sold is: " + TypeOfIceCreamSold(icecream) + "\n"
                +"The percentage of " + icecream + " sold is: " + percentIceSale(icecream) +"%";
        
        return output;
    }
    
    //main test class to ensure everything is working and run the above class
    public static void main(String[]args){
        /*
        creates a new IceCreamSold object named "ic" which loads the data
        from the file at the directory path/icecream.dat 
        can be changed using .//src//package//name//icecream.dat
        */
        IceCreamSold ic = new IceCreamSold("./icecream.dat");
        
        /*
        executing the toString parameter method to take the Strawberry string
        and find all the information about this item
        */
        System.out.println(ic.toString("Strawberry"));
    }
}



