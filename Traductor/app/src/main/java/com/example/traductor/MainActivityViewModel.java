package com.example.traductor;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.HashMap;
import java.util.Map;

public class MainActivityViewModel extends AndroidViewModel {
    private Context context;

    private MutableLiveData<String> resultado = null;
    private HashMap<String, String> traductor = new HashMap<>();

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
        traductor.put("casa","house");
        traductor.put("perro", "dog");
        traductor.put("arbol", "tree");
        traductor.put("comida", "food");
        traductor.put("auto", "car");

    }

    public LiveData<String> getResultado() {
        if (resultado == null) {
            resultado = new MutableLiveData<>();
        }
        return resultado;
    }

    public void getTraductor(String palabra) {
        if(traductor.containsKey(palabra)){
            resultado.setValue(traductor.get(palabra));
        }else{
            resultado.setValue("No encontrada!");
        }
    }


}
