
package week5.java;

//start of class
public class ObjectOrientation {
    
    //variables (Atributes) used in the class
    private static String anObject ="";
    public static int numberOfObjects = 0;
    
    //Constuctor that takes one variable, a String time to make the object
    public ObjectOrientation(String anObject){
        this.anObject = anObject; //assign constructor value to the private variable in class
        numberOfObjects++;
    }
    
    //getter method to return the value of private variable field anObject
    public String getAnObject(){
        return anObject;
    }
    
    //setter method to redefine the value of anObject private variable
    public void setAnObject(String anObject){
        this.anObject = anObject;
    }
    
    //static method that adds extra strings to the anObject private variable
    public static String addToString(String toAdd){
        return anObject+= toAdd;
    }
    
    //main testing class
    public static void main(String[]args){
        
        //declare the new object
        ObjectOrientation newObject;
        
        //create the object and sign it values
        newObject = new ObjectOrientation("Test String");
        
        //testing calls
        System.out.println(newObject.getAnObject());
        newObject.setAnObject("New String");
        System.out.println(newObject.getAnObject());
        System.out.println(ObjectOrientation.addToString(" Also add this"));
        System.out.println(ObjectOrientation.numberOfObjects);
    }
    
}
