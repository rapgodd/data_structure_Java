package com.giyeon.data_structure.map.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();


    public void add(Product product, int addQuantity) {
        Integer orDefault = cartMap.getOrDefault(product, 0);
        cartMap.put(product, addQuantity+orDefault);
    }

    public void printAll() {
        Set<Map.Entry<Product, Integer>> entries = cartMap.entrySet();
        for (Map.Entry<Product, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void minus(Product product, int quantity) {
        Integer integer = cartMap.get(product);
        int result = integer - quantity;
        if(result < 0) {
            cartMap.remove(product);
        }else {
            cartMap.put(product, result);
        }
    }
}
