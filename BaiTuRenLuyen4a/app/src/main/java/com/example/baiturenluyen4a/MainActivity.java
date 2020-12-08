package com.example.baiturenluyen4a;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.model.Danhmuc;
import com.example.model.SanPham;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    AutoCompleteTextView auto1;
    Button btnNhap;
    GridView gvSanPham;
    ArrayAdapter<Danhmuc> danhmucAdapter;
    ArrayAdapter<SanPham> sanPhamAdapter;
    Danhmuc selectedDanhmuc = null;
    ArrayAdapter<SanPham> autoSanPham;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyNhap();
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedDanhmuc = danhmucAdapter.getItem(position);
                sanPhamAdapter.clear();
                sanPhamAdapter.addAll(selectedDanhmuc.getSanPhams());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        gvSanPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SanPham sp = sanPhamAdapter.getItem(position);
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Thong tin san pham");
                SanPham sp1 = new SanPham("Iphone4","2000",100);
                SanPham sp2 = new SanPham("Iphone5","2500",100);
                SanPham sp3 = new SanPham("Iphone5s","3000",100);
                SanPham sp4 = new SanPham("Iphone6","3500",100);
                SanPham sp5 = new SanPham("Iphone6s","4000",100);
                SanPham sp6 = new SanPham("Iphone7","4500",100);
                SanPham sp7 = new SanPham("Iphone7s","5000",100);
                SanPham sp8 = new SanPham("Iphone8","5500",100);
                SanPham sp9 = new SanPham("Iphone8s","6000",100);
                SanPham sp10 = new SanPham("SamSungJ7","3000",100);
                SanPham sp11 = new SanPham("A30","2500",100);
                SanPham sp12 = new SanPham("Dell G","5000",100);
                SanPham sp13 = new SanPham("Asus VX5","5500",100);
                SanPham sp14 = new SanPham("MacBook","5500",100);
                SanPham sp15 = new SanPham("Apple Watch5","5500",100);
                SanPham sp16 = new SanPham("SamSung Galaxy Watch","5500",100);
                SanPham sp17 = new SanPham("Fitbit Versa2","5500",100);

                SanPham []arrSp = {sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9,sp10,sp11,sp12,sp13,sp14,sp15,sp16,sp17};
                for(int i=0;i<17;i++)
                {
                    if(sp.getTen().equals(arrSp[i].getTen()))
                    {
                        builder.setMessage("Name: "+arrSp[i].getTen()+"\nPrice: "+arrSp[i].getPrice()+"\nAmount: "+arrSp[i].getAmount());
                    }
                }

                builder.create().show();
            }
        });
    }

    private void XuLyNhap() {
        SanPham sp = new SanPham(auto1.getText().toString());
        selectedDanhmuc.getSanPhams().add(sp);
        sanPhamAdapter.clear();
        sanPhamAdapter.addAll(selectedDanhmuc.getSanPhams());
    }


    private void addControls() {
        spinner = findViewById(R.id.spinner);
        btnNhap = findViewById(R.id.btnNhap);

       danhmucAdapter = new ArrayAdapter<Danhmuc>(MainActivity.this, android.R.layout.simple_spinner_item);
       danhmucAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       spinner.setAdapter(danhmucAdapter);
       danhmucAdapter.add(new Danhmuc("Dien thoai"));
        danhmucAdapter.add(new Danhmuc("May tinh"));
        danhmucAdapter.add(new Danhmuc("Dong ho"));

        gvSanPham = findViewById(R.id.gvSanPham);
        sanPhamAdapter = new ArrayAdapter<SanPham>(MainActivity.this, android.R.layout.simple_list_item_1);
        gvSanPham.setAdapter(sanPhamAdapter);


        auto1 = findViewById(R.id.auto1);
        autoSanPham = new ArrayAdapter<SanPham>(MainActivity.this, android.R.layout.simple_list_item_1);
        auto1.setAdapter(autoSanPham);
        autoSanPham.add(new SanPham("Iphone4"));
        autoSanPham.add(new SanPham("Iphone5"));
        autoSanPham.add(new SanPham("Iphone5s"));
        autoSanPham.add(new SanPham("Iphone6"));
        autoSanPham.add(new SanPham("Iphone6s"));
        autoSanPham.add(new SanPham("Iphone7"));
        autoSanPham.add(new SanPham("Iphone7s"));
        autoSanPham.add(new SanPham("Iphone8"));
        autoSanPham.add(new SanPham("Iphone8s"));
        autoSanPham.add(new SanPham("SamSungJ7"));
        autoSanPham.add(new SanPham("SamSungA30"));

        autoSanPham.add(new SanPham("Dell G"));
        autoSanPham.add(new SanPham("Asus VX5"));
        autoSanPham.add(new SanPham("MacBook"));

        autoSanPham.add(new SanPham("Apple Watch5"));
        autoSanPham.add(new SanPham("SamSung Galaxy Watch"));
        autoSanPham.add(new SanPham("Fitbit Versa2"));



    }
}