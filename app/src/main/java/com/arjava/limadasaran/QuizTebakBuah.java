package com.arjava.limadasaran;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class QuizTebakBuah extends AppCompatActivity {

    private CardView pilihanA, pilihanB, pilihanC;
    private ImageView imageViewTebak;
    private FloatingActionButton fabAsk, fabA, fabB, fabC;
    private MediaPlayer mediaPlayer;
    private Button btnPilihanA, btnPilihanB, btnPilihanC;
    private static int sound = R.raw.buah;
    private int pointBenar = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_tebak_buah);

        sound = R.raw.buah;
        mediaPlayer = MediaPlayer.create(this, sound);
        mediaPlayer.start();

        pilihanA = (CardView) findViewById(R.id.cardQuizA);
        pilihanB = (CardView) findViewById(R.id.cardQuizB);
        pilihanC = (CardView) findViewById(R.id.cardQuizC);

        btnPilihanA = (Button) findViewById(R.id.btnPilihanA);
        btnPilihanB = (Button) findViewById(R.id.btnPilihanB);
        btnPilihanC = (Button) findViewById(R.id.btnPilihanC);

        fabAsk = (FloatingActionButton) findViewById(R.id.fabSoundAsk);
        fabA = (FloatingActionButton) findViewById(R.id.fabPilihanA);
        fabB = (FloatingActionButton) findViewById(R.id.fabPilihanB);
        fabC = (FloatingActionButton) findViewById(R.id.fabPilihanC);

        imageViewTebak = (ImageView) findViewById(R.id.imageViewQuiz);

        quizFirst();

    }

    public void quizFirst() {
        fabAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.buah;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        fabA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.alpukat;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        fabB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.apel;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        fabC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.anggur;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        btnPilihanA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.salah;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
                pointBenar = pointBenar-1;
                quizKedua();
            }
        });

        btnPilihanB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.salah;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
                pointBenar = pointBenar-1;
                quizKedua();
            }
        });

        btnPilihanC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.benar;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
                pointBenar = pointBenar+1;
                quizKedua();
            }
        });
    }

    public void quizKedua(){
        imageViewTebak.setImageResource(R.drawable.nanas);
        btnPilihanA.setText(R.string.nanas);
        btnPilihanB.setText(R.string.durian);
        btnPilihanC.setText(R.string.tomat);

        fabA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.nanas;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        fabB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.durian;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        fabC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.tomat;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        btnPilihanA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.benar;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
                pointBenar = pointBenar+1;
                quizKetiga();
            }
        });

        btnPilihanB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.salah;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
                pointBenar = pointBenar-1;
                quizKetiga();
            }
        });

        btnPilihanC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.salah;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
                pointBenar = pointBenar-1;
                quizKetiga();
            }
        });
    }

    private void quizKetiga() {
        imageViewTebak.setImageResource(R.drawable.ceri);
        btnPilihanA.setText(R.string.strawberry);
        btnPilihanB.setText(R.string.manggis);
        btnPilihanC.setText(R.string.chery);

        fabA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.strawberry;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        fabB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.manggis;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        fabC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.ceri;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        btnPilihanA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.salah;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
                pointBenar = pointBenar-1;
                quizKeempat();
            }
        });

        btnPilihanB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.salah;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
                pointBenar = pointBenar-1;
                quizKeempat();
            }
        });

        btnPilihanC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.benar;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
                pointBenar = pointBenar+1;
                quizKeempat();
            }
        });
    }

    private void quizKeempat() {
        imageViewTebak.setImageResource(R.drawable.jambuair);
        btnPilihanA.setText(R.string.semangka);
        btnPilihanB.setText(R.string.alpukat);
        btnPilihanC.setText(R.string.jambu_air);

        fabA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.semangka;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        fabB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.alpukat;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        fabC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.jambuair;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        btnPilihanA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.salah;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
                pointBenar = pointBenar-1;
                quizKetiga();
            }
        });

        btnPilihanB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.salah;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
                pointBenar = pointBenar-1;
                quizKelima();
            }
        });

        btnPilihanC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.benar;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
                pointBenar = pointBenar+1;
                quizKelima();
            }
        });
    }

    private void quizKelima() {
        imageViewTebak.setImageResource(R.drawable.manggis);
        btnPilihanA.setText(R.string.manggis);
        btnPilihanB.setText(R.string.apel);
        btnPilihanC.setText(R.string.nanas);

        fabA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.manggis;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        fabB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.apel;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        fabC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.nanas;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
            }
        });

        btnPilihanA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.benar;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
                pointBenar = pointBenar+1;
                quizSelesai();
            }
        });

        btnPilihanB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.salah;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
                pointBenar = pointBenar-1;
                quizSelesai();
            }
        });

        btnPilihanC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound = R.raw.salah;
                mediaPlayer = MediaPlayer.create(QuizTebakBuah.this, sound);
                mediaPlayer.start();
                pointBenar = pointBenar-1;
                quizSelesai();
            }
        });
    }

    private void quizSelesai() {
        imageViewTebak.setVisibility(View.GONE);
        fabAsk.setVisibility(View.GONE);
        fabA.setVisibility(View.GONE);
        fabB.setVisibility(View.GONE);
        fabC.setVisibility(View.GONE);
        btnPilihanA.setVisibility(View.GONE);
        btnPilihanB.setVisibility(View.GONE);
        btnPilihanC.setVisibility(View.GONE);
        pilihanA.setVisibility(View.GONE);
        pilihanB.setVisibility(View.GONE);
        pilihanC.setVisibility(View.GONE);


        AlertDialog.Builder alertDialog = new AlertDialog.Builder(QuizTebakBuah.this);
        alertDialog.setTitle(R.string.selesai)
                .setCancelable(false)
                .setIcon(R.drawable.ic_check_circle_purple_300_24dp)
                .setMessage(getResources().getString(R.string.message_finish)+" dengan Point "+ pointBenar)
                .setNegativeButton(R.string.ke_menu, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(QuizTebakBuah.this, MainActivity.class));
                    }
                })
                .setPositiveButton(R.string.ulangi_game, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(QuizTebakBuah.this, QuizTebakBuah.class));
                    }
                });

        alertDialog.show();
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(QuizTebakBuah.this);
        alertDialog.setTitle(R.string.keluar)
                .setNegativeButton(R.string.ke_menu, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(QuizTebakBuah.this, MainActivity.class));
                    }
                })
                .setPositiveButton(R.string.batal, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

        alertDialog.show();
    }

}
