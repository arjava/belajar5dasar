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

public class Buah extends AppCompatActivity {

    GridView grid_buah;
    String[] buah = {
            "ALPUKAT",
            "ANGGUR",
            "APEL",
            "CHERY",
            "DURIAN",
            "JAMBU AIR",
            "MANGGIS",
            "NANAS",
            "SEMANGKA",
            "STRAWBERRY",
            "TOMAT"
    } ;
    int[] imageBuah = {
            R.drawable.alpukat,
            R.drawable.anggur,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.durian,
            R.drawable.jambuair,
            R.drawable.manggis,
            R.drawable.nanas,
            R.drawable.semangka,
            R.drawable.strawberry,
            R.drawable.tomat
    };

    int suaraBuah[] = {
            R.raw.alpukat,R.raw.anggur,R.raw.apel,R.raw.ceri,R.raw.durian,R.raw.jambuair,
            R.raw.manggis,R.raw.nanas,R.raw.semangka,R.raw.strawberry,R.drawable.tomat
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);

        BuahGrid adapter = new BuahGrid(Buah.this, buah, imageBuah);
        grid_buah=(GridView)findViewById(R.id.gridBuah);
        grid_buah.setAdapter(adapter);
        grid_buah.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Buah.this, "Kamu Mengklik Buah: " + buah[+ position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), DetailBuah.class);
                intent.putExtra("namaBuah", buah[position]);
                int imgBuah  = imageBuah[position];
                intent.putExtra("gambarBuah", imgBuah);
                intent.putExtra("suaraBuah", suaraBuah[position]);
                startActivity(intent);

            }
        });
    }

}
