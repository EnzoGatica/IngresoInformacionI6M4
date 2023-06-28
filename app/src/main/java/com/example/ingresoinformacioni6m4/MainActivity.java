package com.example.ingresoinformacioni6m4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ingresoinformacioni6m4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = binding.textName.getText().toString();
                String lastName = binding.textLastName.getText().toString();
                String email = binding.textMail.getText().toString();
                String pass = binding.textPass.getText().toString();

                if(name.isEmpty() || lastName.isEmpty() || email.isEmpty() || pass.isEmpty() || !email.contains("@") ){
                    Toast.makeText(getBaseContext(), "Faltan campos por completar", Toast.LENGTH_SHORT).show();
                    return;
                }
                String texto = "Usuario" + name +" "+lastName + " Email: "+email+" Contraseña: "+ pass;

                Toast.makeText(getBaseContext(), texto, Toast.LENGTH_LONG).show();
            }
        });

    }
}