package com.design_pattern.factory_method.idcard;

import java.util.HashMap;
import java.util.Map;

import com.design_pattern.factory_method.framework.Factory;
import com.design_pattern.factory_method.framework.Product;

public class IDCardFactory extends Factory {

    // Practice 4-2. 通し番号と所持者の対応表
    private Map<Integer, String> IDMap;

    public IDCardFactory() {
        IDMap = new HashMap<Integer, String>();
    }

    @Override
    protected Product createProduct(String owner) {
        Product IDCard = new IDCard(owner, this.IDMap.size() + 1);
        return IDCard;
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "を登録しました。");
    }
    
}
