/*
 * LinkedList is a data structure which use to store nodes data and address of the next node means its a combinations
   of address and data.
 * Linked can be two types those are the following:
            1) Singly LinkedList
            2) Doubly LinkedList

 */
package javacollection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class SimpleLinkedListExample {

    public static void main(String [] args)
    {
        // Creating A Simple LinkedList
        LinkedList linkedList = new LinkedList();
        
        // Adding Elements To The LinkedList
        linkedList.add("Python");   // adding using add(Object e) method
        linkedList.add(1, "C++");   // adding using add(int index, Object element) method
        linkedList.addFirst("Java");   // adding at 1st Node using addFirst(Object e) method
        linkedList.addLast("Ruby");  // adding at last Node using addLast(Object e) method
//        linkedList.addAll(linkedList);  // adding the whole 'linkedList' again to the list
        

        // Iterating Through LinkedList using Iterator Class
        Iterator it = linkedList.iterator();
        
        while(it.hasNext())
        {
            System.out.println("Items inside the LinkedList are the following: " + it.next());
        }
        
    }
}
