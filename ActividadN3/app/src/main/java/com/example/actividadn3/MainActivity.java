package com.example.actividadn3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.actividadn3.Models.Pelicula;
import com.example.actividadn3.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainActivityViewModel vm ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vm =ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerView = binding.rvListaPelis;

        GridLayoutManager grilla = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(grilla);

        vm.getLista().observe(this, new Observer<ArrayList<Pelicula>>() {
            @Override
            public void onChanged(ArrayList<Pelicula> peliculas) {
                PeliculaAdapter adapter = new PeliculaAdapter(MainActivity.this, peliculas, getLayoutInflater());
                recyclerView.setAdapter(adapter);
            }
        });

        vm.llenarLista();
    }
}