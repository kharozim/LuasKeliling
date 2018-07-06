package com.example.ozimos.luaskeliling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luas_persegipanjang extends AppCompatActivity  implements View.OnClickListener{

    EditText edtPanjang, edtLebar;
    Button btHitung;
    TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegipanjang);

        edtPanjang = (EditText) findViewById(R.id.panjang);
        edtLebar = (EditText) findViewById(R.id.lebar);
        btHitung = (Button) findViewById(R.id.btn_hitung);
        tvhasil = (TextView) findViewById(R.id.hasil);


        btHitung.setOnClickListener(this);

        if (savedInstanceState !=null) {
            String hasil = savedInstanceState.getString(STATE_HASIL);
            tvhasil.setText(hasil);
        }
    }

    @Override
    private void onClick (View v){
        if (v.getId() == R.id.btn_hitung){
            String p = edtPanjang.getText().toString().trim();
            String l = edtLebar.getText().toString().trim();

            if (p.length()==0){
                edtPanjang.setError("Panjang tidak boleh kosong");
            }
            else if (l.length()==0){
                edtLebar.setError("Lebar tidak boleh kosong");
            }
            else {
                double P = Double.parseDouble(p);
                double L = Double.parseDouble(l);
                double luas = P * L;
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
