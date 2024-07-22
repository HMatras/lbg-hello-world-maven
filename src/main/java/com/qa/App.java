package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Alice"));
        System.out.println(sayHelloToSomeone("Bob"));
        System.out.println(sayHelloToSomeone("Charlie"));
        System.out.println(sayHelloToSomeone("Zena"));
        System.out.println(sayGoodbye());
        System.out.println(greetMaster("Hubert"));
        System.out.println(greetEveryone("Akhil", "Dilpreet"));
    }
    public static String greetMaster(String name) {
        return "Hello Master " + name;
    }
    public static String greetEveryone(String name1, String name2) {
        return "Hello " + name1 + " " + name2;
    }
    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
