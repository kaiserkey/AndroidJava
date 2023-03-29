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


    public void calcular(String n1, String n2, String option){
        try {
            double dolar = 0.92;
            double euro = 1.08;
            double num1;
            double num2;

            if(n1.equals("")){
                num1 = 0;
            }else{
                num1 = Double.parseDouble(n1);
            }
            if(n2.equals("")){
                num2 = 0;
            }else{
                num2 = Double.parseDouble(n2);
            }

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

    public void radioValue(Boolean value){
        radio.setValue(value);
    }

}
