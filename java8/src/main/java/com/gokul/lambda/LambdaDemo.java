package com.gokul.lambda;

public class LambdaDemo {

    public static void main(String[] args) {

//        before
        HelloLambda helloLambda=new HelloLambda() {
            @Override
            public void sayHi() {
                System.out.println("Hello form Lambda");
            }
        };

//        helloLambda.sayHi();

//        using lambda
        HelloLambda lambda1=()-> System.out.println("Hello from lambda");
        lambda1.sayHi();

    }
}




@FunctionalInterface
interface HelloLambda{

    void sayHi();

}


