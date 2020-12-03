package com.example.model;

import java.util.ArrayList;

public class Danhmuc {
    private String ten;
    private ArrayList<SanPham>sanPhams = new ArrayList<>();

    public Danhmuc(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public ArrayList<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(ArrayList<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    @Override
    public String toString() {
        return this.ten;
    }
}
