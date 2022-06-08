
package javacollection.ArrayList;

import java.util.ArrayList;


public class ArrayListIteratingUsingForEachLoop {
    
    public static void main(String [] args)
    {
        // Creating A SImple ArrayList Class Object
        ArrayList list = new ArrayList();
        
        list.add("Java"); // adding an object "Java" here a String object into the list
        list.add("Python");
        list.add("JavaScript");
        list.add("C++");
        list.add("PHP");
        System.out.println("Now the array size : " + "  "  + list.size());
        
        // iterating through the ArrayList 
        for(Object list2 : list) // thought we didn't specify the type of the list so here declaring Object
        {
            System.out.println("Array Elements are: " + list2);
        }
       
    }
    
}
