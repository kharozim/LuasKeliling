package com.example.ozimos.luaskeliling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kel_trapesium extends AppCompatActivity implements View.OnClickListener {

    private EditText edtRuas1, edtRuas2, edtRuas3, edtRuas4;
    private Button btHitung;
    private TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kel_trapesium);

        edtRuas1 = (EditText) findViewById(R.id.ruas1);
        edtRuas2 = (EditText) findViewById(R.id.ruas2);
        edtRuas3 = (EditText) findViewById(R.id.ruas3);
        edtRuas4 = (EditText) findViewById(R.id.ruas4);
        btHitung = (Button) findViewById(R.id.btn_hitung);
        tvhasil = (TextView) findViewById(R.id.hasil);
        btHitung.setOnClickListener(this);

        if (savedInstanceState != null) {
            String hasil = savedInstanceState.getString(STATE_HASIL);
            tvhasil.setText(hasil);
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_hitung) {

            String ruas1 = edtRuas1.getText().toString();
            String ruas2 = edtRuas2.getText().toString();
            String ruas3 = edtRuas3.getText().toString();
            String ruas4 = edtRuas4.getText().toString();

            if (edtRuas1.length() == 0) {
                edtRuas1.setError("Panjang Ruas 1 tidak boleh kosong");
            } else if (edtRuas2.length() == 0) {
                edtRuas2.setError("Panjang Ruas 2 tidak boleh kosong");
            } else if (edtRuas3.length() == 0) {
                edtRuas3.setError("Panjang Ruas 3 tidak boleh kosong");
            } else if (edtRuas4.length() == 0) {
                edtRuas4.setError("Panjang Ruas 4 tidak boleh kosong");
            } else {
                double p1 = Double.parseDouble(ruas1);
                double p2 = Double.parseDouble(ruas2);
                double p3 = Double.parseDouble(ruas3);
                double p4 = Double.parseDouble(ruas4);
                double keliling = (p1 + p2 + p3 + p4);
                tvhasil.setText(String.valueOf(keliling));
            }
        }
    }

    private static final String STATE_HASIL = "state_hasil";

    @Override
    protected void onSaveInstanceState(Bundle outstate) {
        outstate.putString(STATE_HASIL, tvhasil.getText().toString());
        super.onSaveInstanceState(outstate);
    }
}
