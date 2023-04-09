package com.example.actividadn3;import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.actividadn3.Models.Pelicula;

import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.ViewHolder> {
    private Context context;
    private List<Pelicula> peliculas;
    private LayoutInflater layoutInflater;

    public PeliculaAdapter(Context context, List<Pelicula> peliculas, LayoutInflater layoutInflater) {
        this.context = context;
        this.peliculas = peliculas;
        this.layoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root=layoutInflater.inflate(R.layout.cardview_item,parent,false);
        return new  ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.titulo.setText(peliculas.get(position).getTitulo());
        holder.descripcion.setText(peliculas.get(position).getDescription()+"");
        holder.peliculaImagen.setImageResource(peliculas.get(position).getImagenUrl());
    }

    @Override
    public int getItemCount() {
        return peliculas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView peliculaImagen;
        TextView titulo,descripcion;
        Button boton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            peliculaImagen=itemView.findViewById(R.id.peliculaImagen);
            titulo=itemView.findViewById(R.id.peliculaTitulo);
            descripcion=itemView.findViewById(R.id.peliculaDescripcion);
            boton = itemView.findViewById(R.id.peliculaButton);
            boton.setOnClickListener(v -> {
                Intent intent = new Intent(v.getContext(), DescripcionActivity.class);

                Bundle bundle = new Bundle();
                bundle.putSerializable("pelicula", peliculas.get(getAdapterPosition()));

                intent.putExtras(bundle);

                v.getContext().startActivity(intent);
            });
        }
    }


}
