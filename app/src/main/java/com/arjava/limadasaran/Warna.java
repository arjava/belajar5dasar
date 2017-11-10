package com.arjava.limadasaran;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Warna extends AppCompatActivity {

    GridView grid_warna;
    String[] warna = {
            "MERAH",
            "KUNING",
            "HIJAU",
            "BIRU",
            "PUTIH",
            "COKLAT",
            "UNGU",
            "ORANYE",
            "ABU-ABU",
            "PINK",
            "HITAM"
    } ;
    int[] imageWarna = {
            R.drawable.red,
            R.drawable.yellow,
            R.drawable.green,
            R.drawable.blue,
            R.drawable.white,
            R.drawable.brown,
            R.drawable.purple,
            R.drawable.oranye,
            R.drawable.grey,
            R.drawable.pink,
            R.drawable.black
    };

    int suaraWarna[] = {
            R.raw.merah,R.raw.kuning,R.raw.hijau,R.raw.biru,R.raw.putih,R.raw.coklat,
            R.raw.ungu,R.raw.oranye,R.raw.abu_abu, R.raw.pink, R.raw.hitam
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warna);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        WarnaGrid adapter = new WarnaGrid(Warna.this, warna, imageWarna);
        grid_warna=(GridView)findViewById(R.id.gridWarna);
        grid_warna.setAdapter(adapter);
        grid_warna.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Warna.this, "Kamu Memilih Warna: "+warna[position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), DetailWarna.class);
                intent.putExtra("namaWarna", warna[position]);
                int imgWrn = imageWarna[position];
                intent.putExtra("gambarWarna", imgWrn);
                intent.putExtra("suaraWarna", suaraWarna[position]);
                startActivity(intent);
            }
        });
    }

}
