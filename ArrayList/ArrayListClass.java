
package javacollection.ArrayList;

import java.util.ArrayList;

/*
    ArrayList class implements the List Interface. ArrayList supports dynamic arrays that can
    grow as needed, means resizeable. And null values are also allowed in the ArrayList.

    There are 2 constructors of the ArrayList :
        1. initialize size of the ArrayList
        2. collection object passing 

*/
public class ArrayListClass {
    
    public static void main(String [] args)
    {
        // Creating the ArrayList Class Object
        ArrayList list = new ArrayList();
        
        // Check The Array List Size
        System.out.println( "Array Size is:" +  "  " + list.size());
        
        System.out.println("Inserting the array element");
        
        // Adding Items into the ArrayList with add()
        list.add("Java"); // adding an object "Java" here a String object into the list
        list.add("Python");
        list.add("JavaScript");
        list.add("C++");
        list.add("PHP");
        list.add("R");
        System.out.println("Now the array size : " + "  "  + list.size());
        
        // Inserting At a Particular Index
        list.add(2, "Ruby"); // this object "Ruby" placed at the specified index 2
        
        // printing the list
        System.out.println("Array elements are:" + "  " + list);
        
        // set() method changes the element, means does the replacement 
        list.set(4, "C");
        System.out.println("Array elements are:" + "  " + list);
        
        // to remove element from the ArrayList using remove()
        list.remove("PHP"); // to remove the particular object
        list.remove(1);  // to remove via index number
        
        System.out.println("Array elements are:" + "  " + list);
        
    }
    
}
