package com.arjava.limadasaran;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

public class Hijaiyah extends AppCompatActivity {

    GridView list_hijaiyah;
    String[] hijaiyah = {
            "Ini adalah ALIF",
            "Ini adalah BAA",
            "Ini adalah TAA",
            "Ini adalah TSAA",
            "Ini adalah JIIM",
            "Ini adalah HAA",
            "Ini adalah KHAA",
            "Ini adalah DAAL",
            "Ini adalah DZAAL",
            "Ini adalah RAA",
            "Ini adalah ZAAY",
            "Ini adalah SIIN",
            "Ini adalah SYIIN",
            "Ini adalah SHAAD",
            "Ini adalah DHAAD",
            "Ini adalah THAA",
            "Ini adalah DZHAA",
            "Ini adalah 'AIN",
            "Ini adalah GHAIN",
            "Ini adalah FAA",
            "Ini adalah QAAF",
            "Ini adalah KAAF",
            "Ini adalah LAAM",
            "Ini adalah MIIM",
            "Ini adalah NUUN",
            "Ini adalah WAAU",
            "Ini adalah HAA",
            "Ini adalah HAMZAH",
            "Ini adalah YAA"
    } ;
    int[] imageHijaiyah = {
            R.drawable.alif,
            R.drawable.ba,
            R.drawable.ta,
            R.drawable.tsa,
            R.drawable.jim,
            R.drawable.kha,
            R.drawable.kho,
            R.drawable.dal,
            R.drawable.dzal,
            R.drawable.ro,
            R.drawable.za,
            R.drawable.sin,
            R.drawable.syin,
            R.drawable.sho,
            R.drawable.dho,
            R.drawable.tho,
            R.drawable.dzo,
            R.drawable.ain,
            R.drawable.ghoin,
            R.drawable.fa,
            R.drawable.qof,
            R.drawable.kaf,
            R.drawable.lam,
            R.drawable.mim,
            R.drawable.nun,
            R.drawable.wawu,
            R.drawable.ha,
            R.drawable.hamzah,
            R.drawable.ya
    };

    int suaraHijaiyah[] = {
            R.raw.alif,R.raw.ba,R.raw.ta,R.raw.tsa,R.raw.jim,R.raw.ha,R.raw.kha,R.raw.dal,R.raw.dzal,
            R.raw.ro,R.raw.zay,R.raw.sin,R.raw.syin,R.raw.shod,R.raw.dho,R.raw.tho,R.raw.dzho,R.raw.ain,
            R.raw.ghoin,R.raw.fa,R.raw.qo,R.raw.kaf,R.raw.lam,R.raw.mim,R.raw.nun,R.raw.wau,R.raw.ha,
            R.raw.hamzah,R.raw.yaa
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah);

        list_hijaiyah = (GridView) findViewById(R.id.gridHijaiyah);
        HijaiyahList listAdapter = new HijaiyahList(this, imageHijaiyah, hijaiyah);
        list_hijaiyah.setAdapter(listAdapter);
        list_hijaiyah.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(getApplicationContext(), DetailHijaiyah.class);
                intent.putExtra("namaHijaiyah", hijaiyah[i]);
                int img  = imageHijaiyah[i];
                intent.putExtra("gambarHijaiyah", img);
                intent.putExtra("suaraHijaiyah", suaraHijaiyah[i]);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
