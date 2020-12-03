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
                if(sp.getTen().equals("Cocacola"))
                {
                    intent.putExtra("a","Chinh hang");
                    intent.putExtra("b","Cocacola");
                    intent.putExtra("c","330ml");
                    intent.putExtra("d","Viet Nam");
                }
                else if(sp.getTen().equals("Pepsi"))
                {
                    intent.putExtra("a","Chinh hang");
                    intent.putExtra("b","Pepsi");
                    intent.putExtra("c","330ml");
                    intent.putExtra("d","Viet Nam");
                } if(sp.getTen().equals("7Up"))
                {
                    intent.putExtra("a","Chinh hang");
                    intent.putExtra("b","Seven Up");
                    intent.putExtra("c","500ml");
                    intent.putExtra("d","Duc");
                }
                if(sp.getTen().equals("Milk"))
                {
                    intent.putExtra("a","Chinh hang");
                    intent.putExtra("b","Milk");
                    intent.putExtra("c","450ml");
                    intent.putExtra("d","Ha Lan");
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