package com.design_pattern.factory_method;

import com.design_pattern.factory_method.framework.*;
import com.design_pattern.factory_method.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product p = factory.create("持ち主A");
        p.use();
    }
}
