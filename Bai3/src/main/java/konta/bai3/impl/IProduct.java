package konta.bai3.impl;

import konta.bai3.enity.Product;

public interface IProduct {
    void saveOrUpdate(Product product);
    void deleteById(int id);
    int findById(int id);
}
