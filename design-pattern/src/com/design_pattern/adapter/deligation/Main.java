package com.design_pattern.adapter.deligation;

public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("Hello, World!");
        print.printWeak();
        print.printStrong();
    }
}