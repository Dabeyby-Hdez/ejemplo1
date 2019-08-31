package com.example.a21_pc35.ejemplo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class login extends AppCompatActivity implements View.OnClickListener {

    //Declarar Boton
    Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btnIniciar = findViewById(R.id.btnIniciar);

        btnIniciar.setOnClickListener(this);
        //Alt+Enter
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnIniciar:



	    Intent objI=new Intent( packageContext this, MainActivity.class)
	    startActivity
                Toast.makeText()
        }

    }
}

//dar clic derecho donde esta login.java, new, activity, EmpityActivity y llamamos al archivo sing_up. 