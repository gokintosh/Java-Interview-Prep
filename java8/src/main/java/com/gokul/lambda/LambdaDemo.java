package com.gokul.lambda;

public class LambdaDemo {

    public static void main(String[] args) {

//        before
//        HelloLambda helloLambda=new HelloLambda() {
//            @Override
//            public void sayHi() {
//                System.out.println("Hello form Lambda");
//            }
//        };

//        helloLambda.sayHi();

//        using lambda
//        HelloLambda lambda1=()-> System.out.println("Hello from lambda");
//        lambda1.sayHi();

//        before
//        Func1Para func1Para=new Func1Para() {
//            @Override
//            public void sayName(String name) {
//                System.out.println("Hello Mr. "+name);
//            }
//        };
//        func1Para.sayName("gokul");

//        Func1Para func1Para=name -> System.out.println("Hello Mr. "+name);
//        func1Para.sayName("gokul");

//        FuncMultiPara funcMultiPara=(num1,num2)->num1+num2;
//
//        System.out.println(funcMultiPara.cal(4,6));

        FuncGen<Double>funString=Double::max;

        System.out.println(funString.getValue(4.0,5.0));


        




    }
}

//Generic lambda
interface FuncGen<T>{
    T getValue(T t,T s);
}



interface FuncMultiPara{
    Integer cal(Integer num1,Integer num2);
}

@FunctionalInterface
interface Func1Para{
    void sayName(String name);
}

@FunctionalInterface
interface HelloLambda{

    void sayHi();

}


