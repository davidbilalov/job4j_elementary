package ru.job4j;

public class ArgMethod {
    public static void hello(String name, int n) {
        System.out.println("Hello, " + name);
        System.out.println("Number, " + n);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello(name,age);

    }
}
