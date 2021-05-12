package com.udc.imcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.udc.imcapp.modelo.IMC;

public class MainActivity extends AppCompatActivity {
    private EditText pesotext;
    private EditText esttext;
    private TextView valortext;
    private TextView indtext;
    private ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pesotext=findViewById(R.id.pesotext);
        esttext=findViewById(R.id.esttext);
        valortext=findViewById(R.id.valortext);
        indtext=findViewById(R.id.indtext);
        imagen=findViewById(R.id.imagen);
    }

    public void calcular(View view){
        if(pesotext.getText().length()==0 || esttext.getText().length()==0){
            Toast.makeText(this,"Campo(s) Vacio!!",Toast.LENGTH_SHORT).show();

        }
        else {
            calculoIMC();
        }
    }

    public void calculoIMC(){
        IMC imc=new IMC(pesotext.getText().toString(),esttext.getText().toString());
        valortext.setText(imc.calcularIMCString());
        indtext.setText(imc.indicadorIMC().getMensaje());
        imagen.setImageResource(imc.indicadorIMC().getImagen());

    }
}