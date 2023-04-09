package com.example.actividadn3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.actividadn3.Models.Pelicula;

import java.util.ArrayList;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<ArrayList<Pelicula>> listaPeliculas;
    private ArrayList<Pelicula> peliculas ;

    public MainActivityViewModel() {
        peliculas = new ArrayList<Pelicula>();
    }

    public LiveData<ArrayList<Pelicula>> getLista() {
        if(this.listaPeliculas == null){
            this.listaPeliculas = new MutableLiveData<>();
        }
        return this.listaPeliculas;
    }

    public void llenarLista(){
        peliculas.add(new Pelicula("La Vida de Pi", R.drawable.lavidadepi, "Pi Patel (Suraj Sharma) es un joven cuyo padre es el guardián del zoológico de Pondicherry, en la India. Toda su familia embarcará en un buque de carga gigantesco con destino a Canadá, con la intención de buscar una vida mejor en un nuevo país. Sin embargo, las cosas no saldrán como esperaban, ya que durante la travesía, el barco naufragará, quitándole la vida a prácticamente todos sus miembros. Solo sobrevivirá Pi, que logrará alcanzar una balsa en la que poder refugiarse de morir ahogado. Una barcaza que no se encuentra precisamente vacío. A partir de ahora, Pi tendrá unos curiosos compañeros de viaje: un orangután, una cebra, una hiena... y un precioso tigre de bengala.", "Suraj Sharma, Irrfan Khan, Adil Hussain", "Brokeback Mountain"));
        peliculas.add(new Pelicula("Las Vacaciones de Mr. Bean", R.drawable.mrbean, "Mr. Bean resulta ser el ganador de un sorteo en el que el premio es un viaje. Su destino es el sur de Francia, en el que pretende pasar unas tranquilas y agradables vacaciones al sol. Pero eso es algo complicado para Mr Bean. Pronto su viaje se ve repleto de sus meteduras de patas y caos, que propaga a donde quiera que vaya sin darse cuenta. Llega incluso hasta Cannes, donde inexplicablemente proyectan un video de su viaje en el famoso festival. Y es que, como es costumbre en él, acaba poniendo Francia patas arriba.", "Rowan Atkinson, Willem Dafoe, Emma de Caunes", "Steve Bendelack"));
        peliculas.add(new Pelicula("Matrix", R.drawable.matrix, "Neo (Keanu Reeves) es un joven pirata informático que lleva una doble vida: durante el día ejerce en una empresa de servicios informáticos, mientras que por la noche se dedica a piratear bases de datos y saltarse sistemas de alta seguridad. Su vida cambiará cuando una noche conozca a Trinity (Carrie-Anne Moss), una misteriosa joven que parece ser una leyenda en el mundo de los 'hackers' informáticos. Será ella quien lleve a Neo ante su líder: Morfeo (Laurence Fishburne). Así descubrirá una terrible realidad y el joven deberá decidir si unirse a la resistencia o vivir su vida como hasta ahora. ¿Elegirá Neo la pastilla azul o la roja?", "Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss", "Lana Wachowski, Lilly Wachowski"));
        listaPeliculas.setValue(peliculas);
    }
}