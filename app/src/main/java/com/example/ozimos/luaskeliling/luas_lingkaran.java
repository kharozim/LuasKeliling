package com.example.ozimos.luaskeliling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luas_lingkaran extends AppCompatActivity {

    private EditText jari2;
    private Button btn_hasil;
    private TextView teks_hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        jari2 = (EditText) findViewById(R.id.jari_jari);
        btn_hasil = (Button) findViewById(R.id.btn_hitung);
        teks_hasil = (TextView) findViewById(R.id.tx_hasil);

        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jari = jari2.getText().toString().trim();

                if (jari.length() == 0) {
                    jari2.setError("isikan nilai jari jari lingkaran");
                } else {

                    double r = Double.parseDouble(jari);
                    double luas_lingkaran = (3.14 * r * r);
                    teks_hasil.setText(String.valueOf(luas_lingkaran));
                }
            }

        });

        if (savedInstanceState != null) {
            String hasil = savedInstanceState.getString(STATE_HASIL);
            teks_hasil.setText(hasil);
        }
    }

    private static final String STATE_HASIL = "state_hasil";
    @Override
    protected void onSaveInstanceState(Bundle outstate) {
        outstate.putString(STATE_HASIL, teks_hasil.getText().toString());
        super.onSaveInstanceState(outstate);

    }
}
