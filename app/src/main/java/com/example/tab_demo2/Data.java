package com.example.tab_demo2;

public class Data {
    String brand , product;
    int imgage;
    double price;


    @Override
    public String toString() {
        return "Data{" +
                "bName='" + brand + '\'' +
                ", pName='" + product + '\'' +
                ", img=" + imgage +
                ", price=" + price +
                '}';
    }

    public String getbName() {
        return brand;
    }

    public void setbName(String bName) {
        this.brand = bName;
    }

    public String getpName() {
        return product;
    }

    public void setpName(String pName) {
        this.product = pName;
    }

    public int getImg() {
        return imgage;
    }

    public void setImg(int img) {
        this.imgage = img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
