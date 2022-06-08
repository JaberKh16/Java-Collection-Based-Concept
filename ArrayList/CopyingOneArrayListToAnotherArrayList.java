
package javacollection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class CopyingOneArrayListToAnotherArrayList {
    
    public static void main(String [] args)
    {
        // Creating a generic type ArrayList
        ArrayList <String> list1 = new ArrayList<String> ();
        
        // adding items into the ArrayList
        list1.add("Java");
        list1.add("Python");
        list1.add("JavaScript");
        list1.add("PHP");
        list1.add("C++");
        list1.add("Ruby");
        
        System.out.println("====================================");
        System.out.println("Before Adding first ArrayList values are:");
        System.out.println("====================================");
        // Iterator is used when can't do indexing 
        Iterator it = list1.iterator(); // to make the list an iterator reference which points the 1st item in the list
        while(it.hasNext()) // to check for the next element if the element is exists then true otherwise false
        {
            // to get the next element using the next() 
            System.out.println("Next Element is:" + "  " + it.next());
        }
        
        System.out.println("====================================");
        System.out.println("Before Adding 2nd ArrayList values are:");
        System.out.println("====================================");
        
        // Creating another ArrayList
        ArrayList <String> list2 = new ArrayList<String>();
        
        // adding the new item to this ArrayList
        list2.add("C");
        list2.add("CSS");
        
        // Iterator is used when can't do indexing 
        Iterator it2 = list2.iterator(); // to make the list an iterator reference which points the 1st item in the list
        while(it2.hasNext()) // to check for the next element if the element is exists then true otherwise false
        {
            // to get the next element using the next() 
            System.out.println("Next Element is:" + "  " + it2.next());
        }
        
        System.out.println("====================================");
        System.out.println("After Adding first ArrayList value to the 2nd ArrayList:");
        System.out.println("====================================");
        // Adding 1st ArrayList value to the 2nd ArrayList using addAll(Collection obj)
        list1.addAll(list2);
        
        
        // Iterator is used when can't do indexing 
        Iterator it1 = list1.iterator(); // to make the list an iterator reference which points the 1st item in the list
        while(it1.hasNext()) // to check for the next element if the element is exists then true otherwise false
        {
            // to get the next element using the next() 
            System.out.println("Next Element is:" + "  " + it1.next());
        }
        
    }
    
}
