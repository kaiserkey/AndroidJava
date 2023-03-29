package com.example.conversormoneda;

import android.app.Application;
import android.content.Context;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class MainActivityViewModel extends AndroidViewModel {

    private Context context;
    private MutableLiveData<Double> resultado = null;
    private MutableLiveData<String> radio = null;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.context = application.getApplicationContext();
    }

    public LiveData<Double> getResultado() {
        if (resultado == null) {
            resultado = new MutableLiveData<>();
        }
        return resultado;
    }

    public LiveData<String> getRadio() {
        if (radio == null) {
            radio = new MutableLiveData<>();
        }
        return radio;
    }

    public void calcular(String n1, String n2, String option){
        try {
            double dolar = 0.92;
            double euro = 1.08;
            double num1 = Float.parseFloat(n1);
            double num2 = Float.parseFloat(n2);
            if(option.equals("D")){
                double res = num1 * dolar;
                resultado.setValue(res);
            }

            if(option.equals("E")){
                double res = num2 * euro;
                resultado.setValue(res);
            }

        }
        catch (NumberFormatException e){
            Toast.makeText(context, "Solo puedes ingresar numeros", Toast.LENGTH_LONG).show();
        }

    }

    public void radioValue(String value){
        radio.setValue(value);
    }

}
