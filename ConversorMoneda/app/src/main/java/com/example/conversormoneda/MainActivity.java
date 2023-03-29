package com.example.conversormoneda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.conversormoneda.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);

        viewModel.getResultado().observe(this, new Observer<Double>() {
            @Override
            public void onChanged(Double convert) {
                binding.textResultado.setText(convert+"");
            }
        });

        //if(!binding.radioED.isChecked() && !binding.radioDE.isChecked()){
        //    binding.inputDolares.setEnabled(false);
        //    binding.inputEuros.setEnabled(false);
        //}



        binding.radioDE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.radioED.setChecked(false);
                binding.inputDolares.setEnabled(true);
                binding.inputEuros.setEnabled(false);

            }
        });

        binding.radioED.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.radioDE.setChecked(false);
                binding.inputEuros.setEnabled(true);
                binding.inputDolares.setEnabled(false);
            }
        });

        binding.btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String option = "";
                if(binding.radioDE.isChecked()){
                    option = "D";
                    viewModel.calcular(binding.inputDolares.getText().toString(), option);
                }
                if(binding.radioED.isChecked()){

                    option = "E";
                    viewModel.calcular(binding.inputEuros.getText().toString(), option);
                }
            }
        });


    }
}