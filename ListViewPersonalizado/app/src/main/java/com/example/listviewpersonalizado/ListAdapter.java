package com.example.listviewpersonalizado;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class ListAdapter extends ArrayAdapter<Inmueble> {

    public ListAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
