package com.gokul;

import lombok.Data;

public class Main {
//    why do we need OOP? How do we create 5 students with roll number, name and grade?
//    class in a named group of properties and functions. That virtualizes the real world.
//    classes are just a group of rule for real life entities called objects.(class->logical construct,object->physical reality)

    public static void main(String[] args) {
        Student gokul=new Student();
        gokul.rollno=15;
        gokul.marks=500;
        gokul.name="gokul";
        System.out.println(gokul.toString());
    }




}

@Data
class Student{
    int rollno;
    String name;
    float marks;
}
