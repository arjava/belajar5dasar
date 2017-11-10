package com.arjava.limadasaran;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pemesanan extends AppCompatActivity {

    int quantity = 0;
    int c;
    TextView hasil,harga;
    Button tambah,kurang,order,bayar;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan);


        dklarasi();

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity = quantity + 1;
                hasil.setText(""+quantity);
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity = quantity - 1;
                hasil.setText(""+quantity);
            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(hasil.getText().toString());
                c = a * 1000;
                harga.setText("Rp. " + c);
                bayar.setVisibility(View.VISIBLE);
                input.setVisibility(View.VISIBLE);
                input.setText("");
            }
        });

        bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setError(null);
                if (TextUtils.isEmpty(input.getText().toString())){
                    input.setError("Tidak Boleh Kosong");
                }else if (input.getText().toString().equals(".")) {
                    input.setError("Jangan Gunakan Titik");
                } else {
                    int a = Integer.parseInt(input.getText().toString());
                    int b = a - c;
                    if (b < 0) {
                        String string = getString(R.string.kurang);
                        Toast.makeText(getApplicationContext(), string, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Kembaliannya adalah = " + b, Toast.LENGTH_SHORT).show();
                        bayar.setVisibility(View.GONE);
                        input.setVisibility(View.GONE);
                    }
                }
            }
        });
    }

    private void dklarasi (){
        tambah = (Button) findViewById(R.id.btnPlus);
        kurang = (Button) findViewById(R.id.btnMin);
        order = (Button) findViewById(R.id.order);
        hasil = (TextView) findViewById(R.id.quantity);
        harga = (TextView) findViewById(R.id.harga);
        bayar = (Button) findViewById(R.id.btnBayar);
        input = (EditText) findViewById(R.id.input);
        bayar.setVisibility(View.GONE);
        input.setVisibility(View.GONE);
    }

//    public void increment() {
//
//        display(quantity);
//    }
//
//    public void decrement() {
//        quantity = quantity - 1;
//        display(quantity);
//    }
//
//    private void display(int number){
//        TextView hasil = (TextView) findViewById(R.id.quantity);
//        hasil.setText(number);
//    }
}
