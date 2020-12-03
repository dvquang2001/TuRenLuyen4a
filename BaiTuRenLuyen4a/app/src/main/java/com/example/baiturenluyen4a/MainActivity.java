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
                if(sp.getTen().equals("Iphone4"))
                {
                    builder.setMessage("San pham: "+auto1.getText().toString()+"\n Hang chinh hang"
                    +"\n Gia: 700000 "+"\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Iphone5"))
                {
                    builder.setMessage("San pham "+auto1.getText().toString()+"\n Hang chinh hang"
                            +"Gia: 1200000 "+"\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Iphone5s")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 1900000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Iphone6")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 3000000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Iphone6s")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 5000000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Iphone7")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 6900000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Iphone7s")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 7500000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Iphone8")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 8300000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Iphone8s")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 9000000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("IphoneX")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 1100000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("IphoneXs")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 1290000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Iphone11")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 15000000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Iphone12")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 20000000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("SamSungJ7")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 6900000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("SamSungA30")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 4900000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("SamSungA50")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 5900000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("SamSungM20")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 3800000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("BPhone")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 6900000 " + "\n So luong: 1000+");
                }

                else if(sp.getTen().equals("Dell Inspirion")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 19000000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Dell G")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 23000000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Dell XPS12")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 20900000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Dell XPS13")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 21900000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Dell XPS15")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 22900000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Asus")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 15900000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Asus U43SD")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 16900000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Asus VX5")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 17900000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Asus VX7")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 19900000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("MacBook")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 30900000 " + "\n So luong: 1000+");
                }else if(sp.getTen().equals("KoreTrack")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 5900000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Apple Watch5")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 7900000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("SamSung Galaxy Watch")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 8900000 " + "\n So luong: 1000+");
                }
                else if(sp.getTen().equals("Fitbit Versa2")) {
                    builder.setMessage("San pham: " + auto1.getText().toString() + "\n Hang chinh hang"
                            + "\n Gia: 4900000 " + "\n So luong: 1000+");
                }

                builder.setPositiveButton("Them vao gio hang ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Them thanh cong ",Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("Huy ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
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
        autoSanPham.add(new SanPham("IphoneX"));
        autoSanPham.add(new SanPham("IphoneXs"));
        autoSanPham.add(new SanPham("Iphone11"));
        autoSanPham.add(new SanPham("Iphone12"));
        autoSanPham.add(new SanPham("SamSungJ7"));
        autoSanPham.add(new SanPham("SamSungA30"));
        autoSanPham.add(new SanPham("SamSungA50"));
        autoSanPham.add(new SanPham("SamSungM20"));
        autoSanPham.add(new SanPham("BPhone"));

        autoSanPham.add(new SanPham("Dell Inspirion"));
        autoSanPham.add(new SanPham("Dell G"));
        autoSanPham.add(new SanPham("Dell XPS12"));
        autoSanPham.add(new SanPham("Dell XPS13"));
        autoSanPham.add(new SanPham("Dell XPS15"));
        autoSanPham.add(new SanPham("Asus"));
        autoSanPham.add(new SanPham("Asus U43SD"));
        autoSanPham.add(new SanPham("Asus VX5"));
        autoSanPham.add(new SanPham("Asus VX7"));
        autoSanPham.add(new SanPham("MacBook"));

        autoSanPham.add(new SanPham("KoreTrak"));
        autoSanPham.add(new SanPham("Apple Watch5"));
        autoSanPham.add(new SanPham("SamSung Galaxy Watch"));
        autoSanPham.add(new SanPham("Fitbit Versa2"));



    }
}