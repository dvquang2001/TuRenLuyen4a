package com.example.baiturenluyen4b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.model.SanPham;

public class IntentActivity extends AppCompatActivity {
    TextView txtThongtin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        addControls();
    }

    private void addControls() {
        txtThongtin = findViewById(R.id.txtThongtin);

        Intent intent = getIntent();
        SanPham sanPham = (SanPham) intent.getSerializableExtra("SelectedSanPham");
        txtThongtin.setText("Nguon goc: "+sanPham.getNguongoc()+"\nHang: "+sanPham.getTen()+
                "\nDung tich: "+sanPham.getDungtich()+"\nXuat xu: "+sanPham.getXuatxu());
    }
}