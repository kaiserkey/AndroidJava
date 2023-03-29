package com.example.listviewpersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Inmueble> lista = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();
        generarListView();
    }

    public void generarListView() {
        ArrayAdapter<Inmueble> adapter = new ListAdapter(this, R.layout.item, lista, getLayoutInflater());

        ListView lv = findViewById(R.id.MiLista);
        lv.setAdapter(adapter);

    }

    public void cargarDatos() {
        lista.add(new Inmueble(R.drawable.img1, "Direccion 123", 180000000));
        lista.add(new Inmueble(R.drawable.img2, "Direccion 789", 120000000));
        lista.add(new Inmueble(R.drawable.img3, "Direccion 456", 150000000));
    }
}