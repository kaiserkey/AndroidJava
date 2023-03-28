package com.example.calculadora;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;


public class MainActivityViewModel extends AndroidViewModel {
    private Context context;
    private MutableLiveData<Integer> resultado = null;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.context = application.getApplicationContext();
    }

    public LiveData<Integer> getResultado(){
        if(this.resultado == null){
            this.resultado = new MutableLiveData<>();
        }
        return resultado;
    }

    public void calcular(String n1, String n2){
        try {
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            int res = num1 + num2;

            resultado.setValue(res);
        }
        catch (NumberFormatException e){
            Toast.makeText(context, "Solo puedes ingresar numeros", Toast.LENGTH_LONG).show();
        }

    }
}
