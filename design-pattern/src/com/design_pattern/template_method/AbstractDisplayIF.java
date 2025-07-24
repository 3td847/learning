package com.design_pattern.template_method;

public interface AbstractDisplayIF {

    // Practice 3-4. defaultを使用して具体メソッドをinterfaceに実装
    default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    };

    void open();
    void print();
    void close();
}
