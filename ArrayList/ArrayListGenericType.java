
package javacollection.ArrayList;

import java.util.ArrayList;


public class ArrayListGenericType {
    
    public static void main(String [] args)
    {
        // Create A Generic Type ArrayList where we specified that its type is String in <>
        ArrayList <String> list = new ArrayList<String>();
        
        // adding the elements inside the array
        list.add("Apple");
        list.add("MicroSoft");
        list.add("Macintosh");
        list.add("Linux");
        
        for(Object newList : list)
        {
            System.out.println("Item is:" + "  " +newList);
        }
    }
    
}
