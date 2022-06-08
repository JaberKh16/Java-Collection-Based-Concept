
package javacollection.ArrayList;

import java.util.ArrayList;


public class ArrayListIteratingUsingForLoop {
    
    public static void main(String [] args)
    {
        // Creating an ArrayList Object for the Integer Value
        ArrayList <Integer> value = new ArrayList<Integer>();
        
        // adding the values to the ArrayList
        value.add(45);
        value.add(55);
        value.add(100);
        value.add(34);
        value.add(88);
        
        // Looping through the ArrayList using For Loop
        for(int i = 0; i < value.size(); i++) // value.size() to get the size of the ArrayList basically the no. of items
        {
            // get() returns the element at the specified index
            System.out.println("Array Elements are at index no :" + "  " + i  + "  and the value is:" + "  "+ value.get(i));
        }
    }
}
