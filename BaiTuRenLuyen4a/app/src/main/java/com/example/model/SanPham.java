package com.example.model;

import java.io.Serializable;

public class SanPham implements Serializable {
    private String ten;
    private String price;
    private int amount;
    private Danhmuc danhmuc;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public SanPham(String ten) {
        this.ten = ten;
    }

    public SanPham(String ten, String price, int amount) {
        this.ten = ten;
        this.price = price;
        this.amount = amount;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Danhmuc getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(Danhmuc danhmuc) {
        this.danhmuc = danhmuc;
    }

    @Override
    public String toString() {
        return this.ten;
    }
}
