package com.design_pattern.template_method;

public class Main {
    public static void main(String[] args) {
        CharDisplay charDisplay = new CharDisplay('H');
        charDisplay.display();

        StringDisplay stringDisplay = new StringDisplay("Hello, World!!");
        stringDisplay.display();
    }
}
