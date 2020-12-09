package com.example.model;

import java.io.Serializable;

public class SanPham implements Serializable {
    private String nguongoc;
    private String Dungtich;
    private String xuatxu;
    private String ten;
    private int hinh;
    private int gia;
    

    public SanPham() {
    }

    public SanPham(int hinh, String ten, int gia) {
        this.hinh = hinh;
        this.ten = ten;
        this.gia = gia;
    }

    public SanPham(String nguongoc, String ten, String dungtich, String xuatxu) {
        this.nguongoc = nguongoc;
        this.ten = ten;
        Dungtich = dungtich;
        this.xuatxu = xuatxu;
        
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    public String getDungtich() {
        return Dungtich;
    }

    public void setDungtich(String dungtich) {
        Dungtich = dungtich;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
