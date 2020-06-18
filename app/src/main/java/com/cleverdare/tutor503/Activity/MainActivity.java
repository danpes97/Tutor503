package com.cleverdare.tutor503.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cleverdare.tutor503.Clases.Url;
import com.cleverdare.tutor503.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtUsuario = findViewById(R.id.txtUsuario);
        final EditText txtContrasena = findViewById(R.id.txtContrasena);
        Button btnIngresar = findViewById(R.id.btnIngresar);
        Button btnRegistrar = findViewById(R.id.btnRegistrar);
        TextView lblRepContra = findViewById(R.id.lblRepContra);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = txtUsuario.getText().toString();
                String contrasena = txtContrasena.getText().toString();

                if (usuario.isEmpty() || contrasena.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Validando...", Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "Debe escribir su usuario y contraseña para ingresar", Toast.LENGTH_LONG).show();
                }
                else if (usuario.equals("tutor1") & contrasena.equals("1")){
                    ((Url) MainActivity.this.getApplication()).setId(1);
                    Toast.makeText(MainActivity.this, "Validando...", Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "Bienvenido " + usuario, Toast.LENGTH_LONG).show();
                    Intent inteVideoActivity = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(inteVideoActivity);
                }
                else if (usuario.equals("tutor2") & contrasena.equals("2")){
                    ((Url) MainActivity.this.getApplication()).setId(2);
                    Toast.makeText(MainActivity.this, "Validando...", Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "Bienvenido " + usuario, Toast.LENGTH_LONG).show();
                    Intent inteVideoActivity = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(inteVideoActivity);
                }
                else if (usuario.equals("tutor3") & contrasena.equals("3")){
                    ((Url) MainActivity.this.getApplication()).setId(3);
                    Toast.makeText(MainActivity.this, "Validando...", Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "Bienvenido " + usuario, Toast.LENGTH_LONG).show();
                    Intent inteVideoActivity = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(inteVideoActivity);
                }
                else if (usuario.equals("tutor4") & contrasena.equals("4")){
                    ((Url) MainActivity.this.getApplication()).setId(4);
                    Toast.makeText(MainActivity.this, "Validando...", Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "Bienvenido " + usuario, Toast.LENGTH_LONG).show();
                    Intent inteVideoActivity = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(inteVideoActivity);
                }
                else {

                    Toast.makeText(MainActivity.this, "Sus credenciales no son validas", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent inteRegistroActivity = new Intent(MainActivity.this, RegistroActivity.class);
                Intent inteRegistroActivity = new Intent(MainActivity.this, RegistroActivity.class);
                startActivity(inteRegistroActivity);
            }
        });

        lblRepContra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Se envio un mensaje a su correo", Toast.LENGTH_LONG).show();
            }
        });
    }
}