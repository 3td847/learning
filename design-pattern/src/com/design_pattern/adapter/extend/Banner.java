package com.design_pattern.adapter.extend;

public class Banner {
    private String message;

    public Banner(String message) {
        this.message = message;
    }

    public void showWithAster() {
        System.out.println("** " + message + " **");
    }

    public void showWithParen() {
        System.out.println("( " + message + " )");
    }
}
