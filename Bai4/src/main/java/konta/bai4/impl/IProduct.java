package konta.bai4.impl;

import konta.bai4.entity.Product;

public interface IProduct {
    void SaveOrUpdate(Product product);
    void deleteById(int id);
    int findById(int id);
}
