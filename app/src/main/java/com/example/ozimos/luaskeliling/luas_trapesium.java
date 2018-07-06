package com.example.ozimos.luaskeliling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luas_trapesium extends AppCompatActivity implements View.OnClickListener{

    private EditText edtRuas1, edtRuas2, edtTinggi;
    private Button btHitung;
    private TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_trapesium);

        edtRuas1 = (EditText) findViewById(R.id.ruas1);
        edtRuas2 = (EditText) findViewById(R.id.ruas2);
        edtTinggi = (EditText) findViewById(R.id.tinggi);
        btHitung = (Button) findViewById(R.id.btn_hitung);
        tvhasil = (TextView) findViewById(R.id.hasil);

        btHitung.setOnClickListener(this);

        if (savedInstanceState !=null) {
            String hasil = savedInstanceState.getString(STATE_HASIL);
            tvhasil.setText(hasil);
        }
    }

    @Override
    public void onClick (View v){
        if (v.getId() == R.id.btn_hitung){
            if (edtRuas1.length() == 0) {
                edtRuas1.setError("Panjang Ruas1 tidak boleh kosong");
            } else if (edtRuas2.length() == 0) {
                edtRuas2.setError("Panjang Ruas2 tidak boleh kosong");
            }else if (edtTinggi.length() == 0) {
                edtTinggi.setError("Tinggi tidak boleh kosong");
            }
        }
    }

    private static final String STATE_HASIL = "state_hasil";
    @Override
    protected void onSaveInstanceState(Bundle outstate){
        outstate.putString(STATE_HASIL, tvhasil.getText().toString());
        super.onSaveInstanceState(outstate);
    }
}
