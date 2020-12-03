package com.example.model;

import java.io.Serializable;

public class SanPham implements Serializable {
    private String ten;
    private Danhmuc danhmuc;

    public SanPham(String ten) {
        this.ten = ten;
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
