/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student 
{
    public int studentId;
    public String name;
    
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
    
    public String toString()
    {
        return (this.studentId + " " + this.name);
    }
}

class SortByStudentId implements Comparator <Student>
{

    @Override
    public int compare(Student s1, Student s2) {
        return s1.studentId - s2.studentId;
    }
    
}

class SortByStudentName implements Comparator <Student>
{

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
    
}
public class ComparatorInterfaceExample {
    public static void main(String [] args)
    {
        // Creating an ArrayList of Student Class
        ArrayList<Student> stu = new ArrayList<Student>();
        stu.add(new Student(1111, "Jaber"));
        stu.add(new Student(4211, "Rajot"));
        stu.add(new Student(3334, "Karim"));
        stu.add(new Student(8324, "Farhan"));
        
        
        System.out.println("First Compare By The Student ID:");
        System.out.println("=============================================");
        
        System.out.println("Unsorted Array List Elements are:");
        for(int i=0; i < stu.size(); i++)
        {
            System.out.println(stu.get(i));
        }
        
        Collections.sort(stu, new SortByStudentId());
        
        System.out.println("After Sorting Array List Elements are:");
        for(int i=0; i < stu.size(); i++)
        {
            System.out.println(stu.get(i));
        }
        
        
        System.out.println("\n\nSecond Compare By The Student Name:");
        System.out.println("=============================================");
        
        System.out.println("Unsorted Array List Elements are:");
        for(int i=0; i < stu.size(); i++)
        {
            System.out.println(stu.get(i));
        }
        
        Collections.sort(stu, new SortByStudentName());
        
        System.out.println("After Sorting Array List Elements are:");
        for(int i=0; i < stu.size(); i++)
        {
            System.out.println(stu.get(i));
        }
    }
}
