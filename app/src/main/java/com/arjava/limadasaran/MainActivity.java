package com.arjava.limadasaran;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Button angka, alphabet, buah, hijaiyah, warna;
    private boolean fabExpanded = false;
    private FloatingActionButton fabMenus;
    private LinearLayout linearLayoutAbout;
    private LinearLayout linearLayoutRate;
    private LinearLayout linearLayoutMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka = (Button) findViewById(R.id.btAngka);
        alphabet = (Button) findViewById(R.id.btAlphabet);
        buah = (Button) findViewById(R.id.btBuah);
        hijaiyah = (Button) findViewById(R.id.btHijaiyah);
        warna = (Button) findViewById(R.id.btWarna);

        fabMenus = (FloatingActionButton) findViewById(R.id.fabMenus);
        linearLayoutAbout = (LinearLayout) findViewById(R.id.lineAbout);

        getSupportActionBar().setTitle(null);

        fabMenus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fabExpanded == true) {
                    closeMenuFab();
                } else {
                    openMenuFab();
                }
            }
        });

        angka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Angka.class));
            }
        });

        alphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Alphabet.class));
            }
        });

        buah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Buah.class));
            }
        });

        hijaiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Hijaiyah.class));
            }
        });

        warna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Warna.class));
            }
        });

        closeMenuFab();
    }

    private void openMenuFab() {
        linearLayoutAbout.setVisibility(View.VISIBLE);
        fabMenus.setImageResource(R.drawable.angka_1);
        fabExpanded = true;
    }

    private void closeMenuFab() {
        linearLayoutAbout.setVisibility(View.INVISIBLE);
        fabMenus.setImageResource(R.drawable.alif);
        fabExpanded = false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// Handle action bar item clicks here. The action bar will
// automatically handle clicks on the Home/Up button, so long
// as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
//noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Intent i = new Intent(MainActivity.this, About.class);
            startActivity(i);
        }
        if (id == R.id.action_pemesanan) {
            Intent i = new Intent(MainActivity.this, Pemesanan.class);
            startActivity(i);
        }
        if (id == R.id.contacts) {
            Intent i = new Intent(MainActivity.this, Kontak.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Yakin ingin keluar!")
                .setCancelable(true)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //do things
                        finish();
                    }
                })
                .setNegativeButton("Kembali", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
//        super.onBackPressed();
    }
}