package com.gokul;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Main {
//    why do we need OOP? How do we create 5 students with roll number, name and grade?
//    class in a named group of properties and functions. That virtualizes the real world.
//    classes are just a group of rule for real life entities called objects.(class->logical construct,object->physical reality)

    public static void main(String[] args) {
//        Student gokul=new Student(12,"Gokul",123);
//
//        System.out.println(gokul.toString());
//        gokul.greeting();

        A a;
        for(int i=0;i<1000000000;i++){
            a=new A("Gokul");
        }
    }




}

@AllArgsConstructor
class A{
    String name;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("destroyed");
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Student{
    int rollno;
    String name;
    float marks;


    void greeting(){
        System.out.println("The name is "+name);
    }


}
