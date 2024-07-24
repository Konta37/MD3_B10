package konta.bai4.entity;

public class Product {
    private String name;
    private double price;
    private int stock;
    private String imageBase64;

    public Product(String name, double price, int stock, String imageBase64) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.imageBase64 = imageBase64;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }
}
