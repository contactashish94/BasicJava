package com.ashish.java8streams;

import java.util.ArrayList;
import java.util.List;

public class Ex_ReduceStream {
    public static void main(String[] args) {
        List<ProductInfo> info = new ArrayList<>();

        info.add(new ProductInfo("Rice", 123));
        info.add(new ProductInfo("Rice_2", 123));
        info.add(new ProductInfo("Rice_3", 123));
        info.add(new ProductInfo("Rice_4", 123));
        System.out.println(info);

        String str = info.stream()
                .map(ProductInfo::getName)
                .reduce("", (a,b)-> {
                    return a+b+", ";
                });

        System.out.println(str);
    }
}
class ProductInfo{
    String name;
    int price;

    public ProductInfo(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ProductInfo [name="+ name + ", Price" + price+"]";
    }
}