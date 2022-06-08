
package javacollection.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;


public class ArrayListUsingListIteraor {
    
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
        
        ListIterator lit = list.listIterator(); // to make the list an iterator reference
        while(lit.hasNext()) // to check for the next element if the element is exists then true otherwise false
        {
            // to get the next element using the next() 
            System.out.println("Next Element is:" + "  " + lit.next());
        }
    }
    
}
