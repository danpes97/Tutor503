package com.cleverdare.tutor503.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.cleverdare.tutor503.R;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        EditText txtNombre = findViewById(R.id.txtNombre);
        EditText txtApellido = findViewById(R.id.txtApellido);
        EditText txtCorreo = findViewById(R.id.txtCorreo);
        EditText txtContrasenaRegistro = findViewById(R.id.txtContrasenaRegistro);
        EditText txtConfirmaContrasenaRegistro = findViewById(R.id.txtConfirmaContrasenaRegistro);
        EditText txtFechaNacimiento = findViewById(R.id.txtFechaNacimiento);
        Button btnRegistrarRegistro = findViewById(R.id.btnRegistrarRegistro);
        RadioButton rbtnMasculino = findViewById(R.id.rbtnMasculino);
        RadioButton rbtnFemenino = findViewById(R.id.rbtnFemenino);

        btnRegistrarRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistroActivity.this, "Registro exitoso", Toast.LENGTH_LONG).show();
                Intent inteVideoActivity = new Intent(RegistroActivity.this, HomeActivity.class);
                startActivity(inteVideoActivity);
            }
        });
    }
}