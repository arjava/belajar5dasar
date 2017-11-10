package com.arjava.limadasaran;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

public class Alphabet extends AppCompatActivity {

//    ListView list_abjad;
    GridView grid_abjad;
    String[] abjad = {
            "Ini adalah Huruf A",
            "Ini adalah Huruf B",
            "Ini adalah Huruf C",
            "Ini adalah Huruf D",
            "Ini adalah Huruf E",
            "Ini adalah Huruf F",
            "Ini adalah Huruf G",
            "Ini adalah Huruf H",
            "Ini adalah Huruf I",
            "Ini adalah Huruf J",
            "Ini adalah Huruf K",
            "Ini adalah Huruf L",
            "Ini adalah Huruf M",
            "Ini adalah Huruf N",
            "Ini adalah Huruf O",
            "Ini adalah Huruf P",
            "Ini adalah Huruf Q",
            "Ini adalah Huruf R",
            "Ini adalah Huruf S",
            "Ini adalah Huruf T",
            "Ini adalah Huruf U",
            "Ini adalah Huruf V",
            "Ini adalah Huruf W",
            "Ini adalah Huruf X",
            "Ini adalah Huruf Y",
            "Ini adalah Huruf Z"
    } ;
    int[] imageAbjad = {
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l,
            R.drawable.m,
            R.drawable.n,
            R.drawable.o,
            R.drawable.p,
            R.drawable.q,
            R.drawable.r,
            R.drawable.s,
            R.drawable.t,
            R.drawable.u,
            R.drawable.v,
            R.drawable.w,
            R.drawable.x,
            R.drawable.y,
            R.drawable.z
    };

    int suaraAbjad[] = {
            R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,R.raw.i,R.raw.j,R.raw.k,R.raw.l,
            R.raw.m,R.raw.n,R.raw.o,R.raw.p,R.raw.q,R.raw.r,R.raw.s,R.raw.t,R.raw.u,R.raw.v,R.raw.w,R.raw.x,
            R.raw.y,R.raw.z
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        grid_abjad = (GridView) findViewById(R.id.gridAlphabet);
        AlphabetList listAdapter = new AlphabetList(this, imageAbjad, abjad);
        grid_abjad.setAdapter(listAdapter);
        grid_abjad.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(getApplicationContext(), DetailAlphabet.class);
                intent.putExtra("namaAbjad", abjad[i]);
                int img  = imageAbjad[i];
                intent.putExtra("gambarAbjad", img);
                intent.putExtra("suaraAbjad", suaraAbjad[i]);
                startActivity(intent);
            }
        });
    }
}
