package konta.bai4.services;

import konta.bai4.entity.Product;
import konta.bai4.impl.IProduct;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProduct {
    public static List<Product> products = new ArrayList<>();

    @Override
    public void SaveOrUpdate(Product product) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public int findById(int id) {
        return 0;
    }
}
