
package javacollection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class CloningTheArrayList {
    
    public static void main(String [] args)
    {
         // Creating A Generic Type ArrayList
        ArrayList <String> list1 = new ArrayList<String> ();
        
        // adding items into the ArrayList
        list1.add("Java");
        list1.add("Python");
        list1.add("JavaScript");
        list1.add("PHP");
        list1.add("C++");
        list1.add("Ruby");
        
        // Iterator is used when can't do indexing 
        Iterator it = list1.iterator(); // to make the list an iterator reference which points the 1st item in the list
        while(it.hasNext()) // to check for the next element if the element is exists then true otherwise false
        {
            // to get the next element using the next() 
            System.out.println("Next Element is:" + "  " + it.next());
        }
        
        // Creating Another Generic Type ArrayList 
        ArrayList <String> list2 = new ArrayList <String> ();
        
        // Cloning the ArrayList 
        list2 = (ArrayList<String>) list1.clone();
        System.out.println("Before cloning the ArrayList: " +  "  "+list1);
        System.out.println("After cloning the ArrayList");
        System.out.println("Cloning the ArrayList: " +  "  "+list2);
    }
    
}
