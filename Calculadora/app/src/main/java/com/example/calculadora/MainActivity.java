package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MainActivityViewModel vm;
    private EditText num1, num2;
    private Button sumar;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // crear el view model
        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);

        //accedo a los componentes de la vista
        num1 = findViewById(R.id.etN1);
        num2 = findViewById(R.id.etN2);
        sumar = findViewById(R.id.btnCalcular);
        result = findViewById(R.id.etResult);

        //coloco el observer al mutable del view model
        vm.getResultado().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer suma) {
                result.setText(suma+"");
            }
        });

        //listener del boton
        this.sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vm.calcular(num1.getText().toString(), num2.getText().toString());
            }
        });

    }




}