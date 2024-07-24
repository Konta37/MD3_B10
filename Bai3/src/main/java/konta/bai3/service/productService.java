package konta.bai3.service;

import konta.bai3.enity.Product;
import konta.bai3.impl.IProduct;

import java.util.ArrayList;
import java.util.List;

public class productService implements IProduct {
    public static List<Product> productList = new ArrayList<Product>();

    static {
        productList.add(new Product(1,"Bim Bim","https://bizweb.dktcdn.net/thumb/grande/100/477/947/products/bimbimlaysvitaobien82g.jpg?v=1683182833847",1200,12));
        productList.add(new Product(1,"Coca cola","https://tea-3.lozi.vn/v1/ship/resized/losupply-quan-tan-phu-quan-tan-phu-ho-chi-minh-1618467447167540212-nuoc-ngot-coca-cola-lon-320ml-0-1626403242?w=480&type=o",1500,5));
        productList.add(new Product(1,"Khoai tây","https://hongngochospital.vn/bai-viet/update/dinh-duong-tu-khoai-tay.jpg",2000,9));
    }


    @Override
    public void saveOrUpdate(Product product) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public int findById(int id) {
        return 0;
    }
}
