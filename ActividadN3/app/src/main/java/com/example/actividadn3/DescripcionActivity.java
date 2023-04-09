package com.example.actividadn3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.actividadn3.Models.Pelicula;
import com.example.actividadn3.databinding.ActivityDescripcionPeliculaBinding;


public class DescripcionActivity extends AppCompatActivity {

    private ActivityDescripcionPeliculaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDescripcionPeliculaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Pelicula pelicula = (Pelicula) bundle.getSerializable("pelicula");

        binding.peliculaTitulo.setText(pelicula.getTitulo());
        binding.peliculaDirector.setText(pelicula.getDirector());
        binding.peliculaActores.setText(pelicula.getActores());
        binding.peliculaDescripcion.setText(pelicula.getDescription());
        binding.peliculaImagen.setImageResource(pelicula.getImagenUrl());
    }
}
