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


    public void calcular(String num, String option){
        try {
            double dolar = 0.92;
            double euro = 1.08;
            double num1;
            double res;

            if(num.equals("")){
                num1 = 0;
            }else {
                num1 = Double.parseDouble(num);
                if(option.equals("D")){
                    res = num1 * dolar;
                    resultado.setValue(res);
                }
                if(option.equals("E")){
                    res = num1 * euro;
                    resultado.setValue(res);
                }
            }

        }
        catch (NumberFormatException e){
            Toast.makeText(context, "Solo puedes ingresar numeros", Toast.LENGTH_LONG).show();
        }

    }

}
