package konta.bai1.impl;

import konta.bai1.entity.Customer;

public interface ICustomerFeature {
    void saveOrUpdate(Customer customer);
    void deleteById(int customerId);
    int findById(int customerId);
}
