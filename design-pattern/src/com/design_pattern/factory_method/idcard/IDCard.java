package com.design_pattern.factory_method.idcard;

import com.design_pattern.factory_method.framework.Product;

public class IDCard extends Product {

    // Practice 4-2. 通し番号の付与
    private int ID;
    private String owner;

    public IDCard(String owner, int ID) {
        this.ID = ID;
        this.owner = owner;
        System.out.println(owner + "のカードを作ります。");
    }

    public int getID() {
        return this.ID;
    }

    public String getOwner() {
        return this.owner;
    }

    @Override
    public String toString() {
        return "[IDCard: " + owner + "]";
    }
    @Override
    public void use() {
        System.out.println(this + "を使います。");
    }
    
}
