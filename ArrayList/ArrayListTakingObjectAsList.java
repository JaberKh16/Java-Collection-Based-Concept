
package javacollection.ArrayList;

import java.util.ArrayList;

class Student
{
    String name;
    String id;
    int age;
    
    Student(String name, String id, int age)
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
public class ArrayListTakingObjectAsList {
    
    public static void main(String [] args)
    {
        // Creating A Generic ArrayList with its type of Student Class
        ArrayList <Student> list = new ArrayList <Student> ();
        
        // Creating the Student Class Object
        Student s1 = new Student("JK", "188", 24);
        Student s2 = new Student("RK", "128", 22);
        Student s3 = new Student("GK", "198", 26);
        
        // adding the Student Object into the list
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        for(int i=0; i < list.size(); i++)
        {
            // get(i) here returns the Student Class Object so Storing in to another Student Object "s"
            Student s = list.get(i);
            s.printInformation();
        }
        
       
    }
    
}
