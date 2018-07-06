package com.example.ozimos.luaskeliling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btLuasLingkaran, btKelLingkaran, btLuasSegitiga, btLuasPersegipanjang, btLuasTrapesium, btKelTrapesium;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLuasLingkaran = (Button) findViewById(R.id.btn_luas_lingkaran);
        btKelLingkaran = (Button) findViewById(R.id.btn_kel_lingkaran);
        btLuasSegitiga = (Button) findViewById(R.id.btn_luas_segitiga);
        btLuasPersegipanjang = (Button) findViewById(R.id.btn_luas_persegipanjang);
        btLuasTrapesium = (Button) findViewById(R.id.btn_luas_trapesium);
        btKelTrapesium = (Button) findViewById(R.id.btn_kel_trapesium);

        btLuasLingkaran.setOnClickListener(this);
        btKelLingkaran.setOnClickListener(this);
        btLuasSegitiga.setOnClickListener(this);
        btLuasPersegipanjang.setOnClickListener(this);
        btLuasTrapesium.setOnClickListener(this);
        btKelTrapesium.setOnClickListener(this);
    }

    @Override
    public void onClick (View v){
        switch (v.getId()){
            case R.id.btn_luas_lingkaran:
                Intent pindah = new Intent(MainActivity.this, com.example.ozimos.luaskeliling.luas_lingkaran.class);
                startActivity(pindah);
                break;
            case R.id.btn_kel_lingkaran:
                Intent pindah2 = new Intent(MainActivity.this, com.example.ozimos.luaskeliling.kel_lingkaran.class);
                startActivity(pindah2);
                break;
            case R.id.btn_luas_segitiga:
                Intent pindah3 = new Intent(MainActivity.this, com.example.ozimos.luaskeliling.luas_segitiga.class);
                startActivity(pindah3);
                break;
            case R.id.btn_luas_persegipanjang:
                Intent pindah4 = new Intent(MainActivity.this, com.example.ozimos.luaskeliling.luas_persegipanjang.class);
                startActivity(pindah4);
                break;
            case R.id.btn_luas_trapesium:
                Intent pindah5 = new Intent(MainActivity.this, com.example.ozimos.luaskeliling.luas_trapesium.class);
                startActivity(pindah5);
                break;
//            case R.id.btn_kel_trapesium:
//                Intent pindah6 = new Intent(MainActivity.this, com.example.ozimos.luaskeliling.kel_trapesium.class);
//                startActivity(pindah6);
//                break;
        }
    }
}
