package konta.bai1.service;

import konta.bai1.entity.Customer;
import konta.bai1.impl.ICustomerFeature;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerFeature {
    public static List<Customer> customerList = new ArrayList<Customer>();

    static {
        customerList.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","https://i.pinimg.com/564x/25/00/14/250014bda643d53b690ff9b7e0625d15.jpg"));
        customerList.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang","https://i.pinimg.com/564x/25/00/14/250014bda643d53b690ff9b7e0625d15.jpg"));
        customerList.add(new Customer("Mai Văn Hoàn2","1983-08-22","Nam Định","https://i.pinimg.com/564x/25/00/14/250014bda643d53b690ff9b7e0625d15.jpg"));
        customerList.add(new Customer("Mai Văn Hoàn3","1983-08-17","Hà Nam","https://i.pinimg.com/564x/25/00/14/250014bda643d53b690ff9b7e0625d15.jpg"));
        customerList.add(new Customer("Mai Văn Hoàn4","1983-08-18","Hà Tây","https://i.pinimg.com/564x/25/00/14/250014bda643d53b690ff9b7e0625d15.jpg"));
    }

    @Override
    public void saveOrUpdate(Customer customer) {

    }

    @Override
    public void deleteById(int customerId) {

    }

    @Override
    public int findById(int customerId) {
        return 0;
    }
}
