package com.design_pattern.singleton.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {
    private static Map<String, Triple> map = new HashMap<String, Triple>();
    private String name;
    static {
        String[] names = {"GANMA", "BETA", "ALPHA"};
        Arrays.stream(names).forEach(name -> map.put(name, new Triple(name)));
    }

    private Triple(String name) {
        this.name = name;
    }

    public static Triple getInstance(String name) throws Exception{
        if(map.containsKey(name)) {
            return map.get(name);
        } else {
            throw new Exception();
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
