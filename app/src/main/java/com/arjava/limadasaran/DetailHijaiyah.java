package com.arjava.limadasaran;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class DetailHijaiyah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hijaiyah);

        Intent a = getIntent();
        final String nama = a.getStringExtra("namaHijaiyah");
        int gambar = a.getIntExtra("gambarHijaiyah", 0);
        final int suara = a.getIntExtra("suaraHijaiyah", 0);

        TextView jdl = (TextView) findViewById(R.id.hijaiyah_detail_judul);
        ImageView img = (ImageView) findViewById(R.id.hijaiyah_detail_gambar);
        getSupportActionBar().setTitle(R.string.hijaiyah);

        jdl.setText(nama);
        img.setImageResource(gambar);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, ""+nama,Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
                MemutarMusik(suara);
            }
        });
    }

    private void MemutarMusik(int posisi) {
        final Uri uri = Uri.parse("android.resource://"+getPackageName() +"/"+posisi);
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(getApplicationContext(), uri);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.start();
    }
}
