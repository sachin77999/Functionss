import java.util.*;
import java.io.*;
public class Student implements Comparable<Student>
{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    
}
public int compareTo(Student st)
{
    if(age==st.age)
    return 0;
    else if(age>st.age)
    return 1;
    else 
    return -1;
}
public static void main(String args[])
{
    ArrayList<Student> al=new ArrayList<Student>();
    al.add(new Student(12,"sachin",123));
    al.add(new Student(13,"rohan",1234));
    Collections.sort(al);
    for(Student st:al)
    {
        System.out.println(st.rollno+" "+st.name+" "+st.age);
    }
}
}