package com.example.exercise_paw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class Register extends AppCompatActivity {

    TextInputEditText rgtNama, rgtEmail, rgtPass, rgtRepass;

    Button btnRegister;

    String nama,email,pass,repass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        rgtNama     = findViewById(R.id.rgNama);
        rgtEmail    = findViewById(R.id.rgEmail);
        rgtPass     = findViewById(R.id.rgPass);
        rgtRepass   = findViewById(R.id.rgRepass);

        btnRegister = findViewById(R.id.btrRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama    = rgtNama.getText().toString();
                email   = rgtEmail.getText().toString();
                pass    = rgtPass.getText().toString();
                repass  = rgtRepass.getText().toString();

                if(nama.length() == 0){
                    rgtNama.setError("Nama Diperlukan");

                    Toast.makeText(getApplicationContext(), "Data Harus diisi Semua", Toast.LENGTH_SHORT).show();
                }
                else if(email.length() == 0){
                    rgtEmail.setError("Email Diperlukan");

                    Toast.makeText(getApplicationContext(), "Data Harus diisi Semua", Toast.LENGTH_SHORT).show();
                }
                else if(pass.isEmpty() || repass.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Data Harus diisi Semua", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(pass.equals(repass) && nama.equals(nama)){
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil", Toast.LENGTH_SHORT).show();

                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());

                        Intent i = new Intent(getApplicationContext(), Task.class);

                        i.putExtras(b);

                        startActivity(i);

                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Password dan Re-Password harus Sama", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}