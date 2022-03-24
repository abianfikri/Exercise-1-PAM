package com.example.exercise_paw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

//    Membuat Variabel Edit text
    TextView register;

//  Membuat variabel TxtEdt
    TextInputEditText TxtEdtNama, TxtEdtPass;

// Membuat variable Button
    Button btnSigin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Memanggil Text Input Edit Text
        TxtEdtNama = findViewById(R.id.lgNama);
        TxtEdtPass = findViewById(R.id.lgPass);

        // memanggil Btn Sigin
        btnSigin = findViewById(R.id.BtnSign);

        // memanggil Id register
        register = findViewById(R.id.txtRegister);

        // Fungsi OnClick Text Register
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Register.class);
                startActivity(i);
            }
        });

        // Fungis onClick Button Sigin
        btnSigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Menyimpan input user
                TxtEdtNama.getText().toString();
                TxtEdtPass.getText().toString();

                if(TxtEdtNama.getText().toString().length()==0){
                    TxtEdtNama.setError("Username Diperlukan");
                    Toast.makeText(getApplicationContext(), "Data Tidak Boleh Kosong!!!", Toast.LENGTH_SHORT).show();
                }
                else if (TxtEdtPass.getText().toString().length()==0) {
                    Toast.makeText(getApplicationContext(), "Password Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
                else if(!TxtEdtNama.getText().toString().equals("Abian")){
                    Toast.makeText(getApplicationContext(), "Nama Salah", Toast.LENGTH_SHORT).show();
                }
                else if(!TxtEdtPass.getText().toString().equals("1234")){
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_SHORT).show();
                }
                else if(TxtEdtNama.getText().toString().equals("Abian") && TxtEdtPass.getText().toString().equals("1234")){

                    Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(getApplicationContext(), "Login Gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}