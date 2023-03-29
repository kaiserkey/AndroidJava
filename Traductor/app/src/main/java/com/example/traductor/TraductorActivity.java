package com.example.traductor;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.traductor.databinding.ActivityTraducirBinding;

public class TraductorActivity extends AppCompatActivity {
    private ActivityTraducirBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traductor);
    }
}
