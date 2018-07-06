package com.example.ozimos.luaskeliling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kel_lingkaran extends AppCompatActivity implements View.OnClickListener {

    private EditText jari2;
    private Button btn_hasil;
    private TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kel_lingkaran);

        jari2 = (EditText) findViewById(R.id.jari_jari);
        btn_hasil = (Button) findViewById(R.id.btn_hitung);
        tvhasil = (TextView) findViewById(R.id.tx_hasil);

        btn_hasil.setOnClickListener(this);

        if (savedInstanceState != null) {
            String hasil = savedInstanceState.getString(STATE_HASIL);
            tvhasil.setText(hasil);
        }

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_hitung) {
            String r = jari2.getText().toString().trim();

            if (r.length() == 0) {
                jari2.setError("Jari-Jari tidak boleh kosong");
            } else {
                double R = Double.parseDouble(r);
                double keliling = 2 * 3.14 * R;
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
