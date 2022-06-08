
package javacollection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratingUsingIterator {
    
    public static void main(String [] args)
    {
        // Creating the ArrayList Class Object 
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        list.add("PHP");
        list.add("C++");
        list.add("Ruby");
        
        // Iterator is used when can't do indexing 
        Iterator it = list.iterator(); // to make the list an iterator reference which points the 1st item in the list
        while(it.hasNext()) // to check for the next element if the element is exists then true otherwise false
        {
            // to get the next element using the next() 
            System.out.println("Next Element is:" + "  " + it.next());
        }
    }
    
}
