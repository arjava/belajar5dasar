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

public class Angka extends AppCompatActivity {

    GridView grid_angka;
    String[] angka = {
            "SATU",
            "DUA",
            "TIGA",
            "EMPAT",
            "LIMA",
            "ENAM",
            "TUJUH",
            "DELAPAN",
            "SEMBILAN",
            "SEPULUH"
    } ;
    int[] imageAngka = {
            R.drawable.angka_1,
            R.drawable.angka_2,
            R.drawable.angka_3,
            R.drawable.angka_4,
            R.drawable.angka_5,
            R.drawable.angka_6,
            R.drawable.angka_7,
            R.drawable.angka_8,
            R.drawable.angka_9,
            R.drawable.angka_spuluh
    };

    int suaraAngka[] = {
            R.raw.angka1,R.raw.angka2,R.raw.angka3,R.raw.angka4,R.raw.angka5,R.raw.angka6,
            R.raw.angka7,R.raw.angka8,R.raw.angka9,R.raw.angka10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);

        AngkaGrid adapter = new AngkaGrid(Angka.this, angka, imageAngka);
        grid_angka=(GridView)findViewById(R.id.gridAngka);
        grid_angka.setAdapter(adapter);
        grid_angka.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Angka.this, "Kamu Memilih Angka : " +angka[+ position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), DetailAngka.class);
                intent.putExtra("namaAngka", angka[position]);
                int imgAnk  = imageAngka[position];
                intent.putExtra("gambarAngka", imgAnk);
                intent.putExtra("suaraAngka", suaraAngka[position]);
                startActivity(intent);

            }
        });
    }
}
