package com.design_pattern.singleton;

public class Singleton {
    
    private static Singleton singleton = new Singleton();

    // newの禁止
    private Singleton() {
        System.out.println("Singletonインスタンスを生成しました");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
