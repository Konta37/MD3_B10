package konta.bai4.entity;

import java.util.ArrayList;
import java.util.List;

public class DataProduct {
    public static List<Product> products = new ArrayList<>();
    public static int n = 1000;
    static {
        products.add(new Product("test",1000,11,"sdf"));
    }
}
