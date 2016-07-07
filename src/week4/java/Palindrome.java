package week4.java;

import java.util.Scanner;

/**
 *A simple class that will check a string to see if it is a palindrome (if it 
 * reads the same forward as backwards).
 */
public class Palindrome {
    //list of private variables that will be used in the class
    private String input ="";
    private static boolean isPalindrome = false; //by default it is set to false
    
    /**
     * A no argument constructor that will create a palindrome object and
     * allow the user to input the value of the String before checking it against
     * the isAPalindrome(String) method and will generate a report about the value
     */
    public Palindrome(){
        start();    
    }
    
    /**
     * single argument constructor that will take a String from the user and assign
     * the values to the values within the Palindrome object.
     * @param input String value to be tested
     */
    public Palindrome(String input){
        input = naturalise(input);
        this.input = input;
        isPalindrome = isAPalindrome(input);
    }
    
    /*
    private method that is used by the no argument constructor to create a program
    that allows the user to input a string value and it will be checked
    this will contiune until the user types anything other than the 'y' character
    */
    private void start(){
        boolean repeat = true;
        while(repeat == true){
            Scanner inPalindrome = new Scanner(System.in);
            System.out.println("Enter a word to be tested as a palindrome: ");
            String userinput = inPalindrome.nextLine();
            input = userinput;
            input = naturalise(input);
            isPalindrome = isAPalindrome(input);
            System.out.println(toString());
            
            System.out.println("Try another? [y] or [n]");
            String choice = inPalindrome.nextLine();
           
            if(!choice.equals("y")){
                repeat = false;                
            }
        }   
    }
    
    /**
     * Static method that takes a single argument that will be reversed and returned.
     * @param x String to be reversed
     * @return String value of the reversed string
     */
    public static String reverse(String x){
        String output = "";
        
        /*
        will run each character backwards in the String value assigned to 'x'
        and add to a new string output
        */
        for(int i = x.length()-1; i>=0;i--){
            output += x.charAt(i);
        }
        
        return output;
    }
    
    /**
     * Static method that takes a String value to be tested and will assign either
     * a boolean value to be returned.
     * @param x String value user defined
     * @return boolean value true = palindrome false = not a palindrome
     */
    public static boolean isAPalindrome(String x){
        x = naturalise(x);
        String toTest = reverse(x);        
        
        if(toTest.equals(x)){ //checks if the reverse value toTest is the same
            isPalindrome = true;
        }
        else{
            isPalindrome = false;
        }
         
        return isPalindrome;
    }
    
    /*
    A private method that is used to make a String lowercase and remove any
    whitespaces found within
    */
    private static String naturalise(String x){
        
        x = x.toLowerCase();
        x = x.replace(" ", "");
        
        return x;
    }
    
    /**
     * Get method used to find the String that has been input by the user as a
     * palindrome.
     * @return  String value for the palindrome
     */
    public String getPalindrome(){
        return input;
    }
    
    /**
     * A get method that checked the boolean value for the palindrome, this is assigned
     * in the constructor.
     * @return boolean value true if palindrome false if not
     */
    public boolean getIsPalindrome(){
        return isPalindrome;
    }
    
    /**
     * A setter method used to set the boolean value of if the string is a palindrome.
     * @param value boolean value returned true if palindrome false if not
     */
    public void setIsPalindrome(boolean value){
        isPalindrome = value;
    }
    
    /**
     * A setter method used to set a string value for the palindrome
     * @param x String parameter which will be taken as the palindrome
     */
    public void setPalindrome(String x){
        input = x;
    }
    
    /**
     * Creates a String to report the information about the palindrome and if the
     * String is indeed a palindrome or not.
     * @return String report of the palindrome
     */
    @Override
    public String toString(){
        String output ="";
        
        output+= "Is " + input + " a Palindrome? Well does this look the same: "
                + reverse(input) +" Well we think: " + getIsPalindrome();
        
        return output;
    }
    
    // main method to test the Palindrome class
    public static void main(String[]args){
        System.out.println(Palindrome.reverse("hello"));
        System.out.println(Palindrome.isAPalindrome("Hello"));
        System.out.println(Palindrome.isAPalindrome("Han nah"));
        
        Palindrome pal = new Palindrome();
    }
}
