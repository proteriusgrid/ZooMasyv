package com.demo;

public class Main {
    public static void main(String[] args) {
        Parent parentChild = new Demo();
        parentChild.print();

        parentChild.staticPrint();
        Demo.staticPrint();

    }
}
