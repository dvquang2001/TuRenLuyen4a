package com.example.baiturenluyen4b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {
    TextView txtNguocGoc, txtXuatXu, txtHang, txtDungTich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        addControls();
    }

    private void addControls() {
        txtDungTich = findViewById(R.id.txtDungTich);
        txtHang = findViewById(R.id.txtHang);
        txtNguocGoc = findViewById(R.id.txtNguonGoc);
        txtXuatXu = findViewById(R.id.txtXuatXu);

        Intent intent = getIntent();
        String a = intent.getStringExtra("a");
        String b = intent.getStringExtra("b");
        String c = intent.getStringExtra("c");
        String d = intent.getStringExtra("d");

        txtNguocGoc.setText("Nguoc goc: "+a);
        txtHang.setText("Hang: "+b);
        txtDungTich.setText("Dung tich: "+c);
        txtXuatXu.setText("Xuat xu: "+d);
    }
}