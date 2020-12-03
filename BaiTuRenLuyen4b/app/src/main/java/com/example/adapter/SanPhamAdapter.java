package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.baiturenluyen4b.R;
import com.example.model.SanPham;

public class SanPhamAdapter extends ArrayAdapter<SanPham> {
    Activity context;
    int resource;
    public SanPhamAdapter(@NonNull Activity context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View customView = this.context.getLayoutInflater().inflate(this.resource,null);
        ImageView imgHinh = customView.findViewById(R.id.imgHinh);
        TextView txtTen = customView.findViewById(R.id.txtTen);
        TextView txtGia = customView.findViewById(R.id.txtGia);

        SanPham sp = getItem(position);
        imgHinh.setImageResource(sp.getHinh());
        txtGia.setText(sp.getGia()+"VND");
        txtTen.setText(sp.getTen());

        return customView;
    }
}
