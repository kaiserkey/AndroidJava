package com.example.traductor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.traductor.databinding.ActivityTraducirBinding;

public class TraductorActivity extends AppCompatActivity {
    private ActivityTraducirBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTraducirBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent recuperar = getIntent();
        binding.textoTraducido.setText(recuperar.getStringExtra("palabra"));
    }
}
