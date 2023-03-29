package com.example.listviewpersonalizado;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;


public class ListAdapter extends ArrayAdapter<Inmueble> {

    public ListAdapter(@NonNull Context context, int resource, @NonNull List<Inmueble> objects, LayoutInflater layout) {
        super(context, resource, objects);
        
    }
}
