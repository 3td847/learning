package com.design_pattern.adapter.extend;

public class Main {
    public static void main(String[] args) {
        // Practice1. Printインターフェースの機能を損なわないためにPrintBannerクラスを使用
        Print print = new PrintBanner("Hello, World!");
        print.printWeak();
        print.printStrong();
    }
}