package com.design_pattern.template_method;

public abstract class AbstractDisplay {

    // Practice 3-2. Overrideを許可しないため、finalメソッドを使用
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    };

    // Practice 3-3. 同一パッケージのみから呼び出しを可能にするため、protectedメソッドを使用
    protected abstract void open();
    protected abstract void print();
    protected abstract void close();
}
