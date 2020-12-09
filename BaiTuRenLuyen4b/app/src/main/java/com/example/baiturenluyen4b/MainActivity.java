package com.example.baiturenluyen4b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.adapter.SanPhamAdapter;
import com.example.model.SanPham;

public class MainActivity extends AppCompatActivity {
    ListView lvSanPham;
    SanPhamAdapter sanPhamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
        fakeDatas();
    }

    private void fakeDatas() {
        sanPhamAdapter.add(new SanPham(R.drawable.coca,"Cocacola",9000));
        sanPhamAdapter.add(new SanPham(R.drawable.pepsi,"Pepsi",9000));
        sanPhamAdapter.add(new SanPham(R.drawable.sevenup,"7Up",8000));
        sanPhamAdapter.add(new SanPham(R.drawable.milk,"Milk",12000));
    }


    private void addEvents() {
        lvSanPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SanPham sp = sanPhamAdapter.getItem(position);
                Intent intent = new Intent(MainActivity.this,IntentActivity.class);
                SanPham sp1 = new SanPham("Chinh hang","Cocacola","330ml","Viet Nam");
                SanPham sp2 = new SanPham("Chinh hang","Pepsi","330ml","Viet Nam");
                SanPham sp3 = new SanPham("Chinh hang","7Up","400ml","Viet Nam");
                SanPham sp4 = new SanPham("Chinh hang","Milk","300ml","Viet Nam");
                SanPham []arrSanpham ={sp1,sp2,sp3,sp4};
                for(int i=0;i<4;i++)
                {
                    if(sp.getTen().equals(arrSanpham[i].getTen()))
                    {
                        intent.putExtra("SelectedSanPham",arrSanpham[i]);
                    }
                }
                startActivity(intent);

            }
        });
    }

    private void addControls() {
        lvSanPham = findViewById(R.id.lvSanPham);
        sanPhamAdapter = new SanPhamAdapter(MainActivity.this,R.layout.item);
        lvSanPham.setAdapter(sanPhamAdapter);
    }
}