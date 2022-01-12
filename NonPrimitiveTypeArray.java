package dsaclass;
import java.util.*;

import java.util.Scanner;

class Student{
    int roll_no;
    String name;
    int age;
    Student(int roll_no,String name,int age)
    {
        this.roll_no=roll_no;
        this.name=name;
        this.age=age;
    }
   public  String toString()
    {
        return roll_no+"\t"+name+"\t"+age;
    }
}
public class NonPrimitiveTypeArray {
    public static void main(String[] args)
    {
        Student[] arr=new Student[2];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("enter roll_no,name and age of Student-"+i+1);
            arr[i]=new Student(s.nextInt(),s.next(),s.nextInt());
        }

        //traversing the array
        System.out.println("elements of array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
