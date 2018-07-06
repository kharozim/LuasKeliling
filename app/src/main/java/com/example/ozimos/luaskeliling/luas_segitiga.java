package com.example.ozimos.luaskeliling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luas_segitiga extends AppCompatActivity implements View.OnClickListener{

    EditText edtAlas, edtTinggi;
    Button btHitung;
    TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        edtAlas = (EditText) findViewById(R.id.alas);
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
    public void onClick (View v) {
        if (v.getId() == R.id.btn_hitung) {
            String a = edtAlas.getText().toString().trim();
            String t = edtTinggi.getText().toString().trim();

            if (a.length() == 0) {
                edtAlas.setError("alas tidak boleh kosong");
            } else if (t.length() == 0) {
                edtTinggi.setError("masukan nilai tinggi");
            } else {
                double A = Double.parseDouble(a);
                double T = Double.parseDouble(t);
                double luas = 0.5 * A * T;
                tvhasil.setText(String.valueOf(luas));
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
