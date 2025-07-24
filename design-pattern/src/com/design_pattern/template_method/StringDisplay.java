package com.design_pattern.template_method;

public class StringDisplay extends AbstractDisplay{
    private String str;
    private int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.length();
    }

    @Override
    protected void open() {
        printLine();
    }

    @Override
    protected void print() {
        System.out.print("|");
        System.out.print(this.str);
        System.out.println("|");
    }

    @Override
    protected void close() {
        printLine();
    }
    
    private void printLine() {
        System.out.print("+");
        for(int i = 0; i < this.width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
