package com.example.gistokosport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    TextView datanama,dataalamat,datatelepon;
    Button btncall;
    ImageView datagambar;
    public static String id,nama,telepon,alamat,gambar;
    public static Double latitude,longitude;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama=findViewById(R.id.tv_nama);
        datatelepon=findViewById(R.id.tv_telepon);
        dataalamat=findViewById(R.id.tv_alamat);
        btncall=findViewById(R.id.btn_call);
        datagambar=findViewById(R.id.img_data);

        datanama.setText(nama);
        dataalamat.setText(alamat);
        datatelepon.setText(telepon);
        Picasso.get().load(gambar).into(datagambar);

        btncall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+telepon));
        startActivity(call);
    }
}
