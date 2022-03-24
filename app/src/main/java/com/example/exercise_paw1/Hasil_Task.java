package com.example.exercise_paw1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Hasil_Task extends AppCompatActivity {

    // Membuat Variable TextView
    TextView TvTask, TvJenis, TvTime;

    String srTask, srJenis, srTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_task);

        // Memanggil Variable TextView yg ada di dalam Id
        TvTask  = findViewById(R.id.hlTask);
        TvJenis = findViewById(R.id.hlJenis);
        TvTime  = findViewById(R.id.hlTime);

        // Penggunaan Bundle
        Bundle bundle = getIntent().getExtras();

        // Mengambil bundel dari kelas Task
        srTask  = bundle.getString("task");
        srJenis = bundle.getString("jenis");
        srTime  = bundle.getString("time");

        TvTask.setText(srTask);
        TvJenis.setText(srJenis);
        TvTime.setText(srTime);
    }

}