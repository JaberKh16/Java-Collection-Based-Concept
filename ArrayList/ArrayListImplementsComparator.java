
package javacollection.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;

class Students
{
    String name;
    int id;
    int age;
    
    Students(String name, int id, int age)
    {
        this.name = name;
        this.id = id;
        this.age = age;
        
    }
    
    void printInformation()
    {
        System.out.println("Name: " + name + " ID: " + id +  " Age: " + age);
    }
    
}

class sortByID implements Comparator<Students>
{

    @Override
    public int compare(Students t, Students t1) {
        
        if (t.id > t1.id) // this does the sorting in ascending order
        {
            return 1; // want a swap
        }
        
        return -1; // dont want a swap
    }
    
}

class sortByAge implements Comparator<Students>
{

    @Override
    public int compare(Students t, Students t1) {
        if(t.age > t1.age) // this does the sorting in ascending order
        {
            return 1; // want a swap
        }
        
        return -1; // dont want a swap
    }
    
}

class sortByName implements Comparator<Students>
{

    @Override
    public int compare(Students t, Students t1) {
       // compareTo() method return either 1 if t.name > t1.name, or -1 if t.name < t1.name , or 0 if t.name = t1.name
       int comp = t.name.compareTo(t1.name);
       if(comp > 0) // sorting in asceding order
       {
           return 1;
       }
       
       return -1;
    }
    
}

public class ArrayListImplementsComparator {
    
    public static void main(String [] args)
    {
        // Creating an ArrayList with its type Student Class
        ArrayList <Students> list = new ArrayList <Students> ();
        
        // Creating the Student Class Object
        Students s1 = new Students("JK", 188, 24);
        Students s2 = new Students("RK", 128, 20);
        Students s3 = new Students("GK", 198, 26);
        Students s4 = new Students("FK", 108, 18);
        
        // adding the Student Object into the list
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        System.out.println("Array Elemenets are:");
        System.out.println("==================================");
        for(int i=0; i < list.size(); i++)
        {
            // get(i) here returns the Student Class Object so Storing in to another Student Object "s"
            Students s = list.get(i);
            s.printInformation();
        }
        
        System.out.println("==================================");
        System.out.println("After Sorting by ID:");
        System.out.println("==================================");
        
        // Creating an Instance of sortByID() class here and passed it with the list.sort() method
        list.sort(new sortByID());
        
        for(int i=0; i < list.size(); i++)
        {
            // get(i) here returns the Student Class Object so Storing in to another Student Object "s"
            Students s = list.get(i);
            s.printInformation();
        }
        
        System.out.println("==================================");
        System.out.println("After Sorting by Age :");
        System.out.println("==================================");
        
        // Creating an Instance of sortByAge() class here and passed it with the list.sort() method
        list.sort(new sortByAge());
        
        for(int i=0; i < list.size(); i++)
        {
            // get(i) here returns the Student Class Object so Storing in to another Student Object "s"
            Students s = list.get(i);
            s.printInformation();
        }
        
        System.out.println("==================================");
        System.out.println("After Sorting by Name :");
        System.out.println("==================================");
        
        // Creating an Instance of sortByName() class here and passed it with the list.sort() method
        list.sort(new sortByName());
        
        for(int i=0; i < list.size(); i++)
        {
            // get(i) here returns the Student Class Object so Storing in to another Student Object "s"
            Students s = list.get(i);
            s.printInformation();
        }
        
       
    }
}
