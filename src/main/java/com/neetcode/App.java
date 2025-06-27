package com.neetcode;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        var feature = Runtime.version().feature();
        System.out.println("👋 Hello, Java " + feature);
    }
}
