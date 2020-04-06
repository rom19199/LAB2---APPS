package com.example.imc_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button siguiente;
    private EditText et1;
    private EditText et2;
    private TextView Resultado;
    private TextView Descripcion;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // siguiente.setOnClickListener(new View.OnClickListener() {
        // @Override
        // public void onClick(View v) {
        //final float[] imc=new float[1];
        et1 = (EditText) findViewById(R.id.txtAltura);
        et2 = (EditText) findViewById(R.id.textPeso);
        Resultado = (TextView) findViewById(R.id.Resultado);
        Descripcion = (TextView) findViewById(R.id.Descripcion);
        img1 = (ImageView) findViewById(R.id.img_Ideal);
        //float peso = Float.parseFloat((et2.getText().toString()));
        //float altura = Float.parseFloat((et1.getText().toString()));
        //imc[0] = (float) ((peso*0.454)/((altura/100)*(altura/100)));


        //Intent siguiente = new Intent(MainActivity.this , Main2Activity.class);

        // startActivity(siguiente);

    }
    //});

    //}
    public void enviar(View view) {
        //et1 = (EditText)findViewById(R.id.txtAltura);
        //et2 = (EditText)findViewById(R.id.textPeso);
        // Resultado = (TextView)findViewById(R.id.Resultado);
        //Descripcion = (TextView)findViewById(R.id.Descripcion);
        final float[] imc = new float[1];
        float peso = Float.parseFloat((et2.getText().toString()));
        float altura = Float.parseFloat((et1.getText().toString()));
        imc[0] = (float) ((peso * 0.454) / ((altura / 100) * (altura / 100)));
        if (imc[0] < 18.5) {
            Resultado.setText(imc[0] + "");
            Descripcion.setText("BAJO PESO");
        } else if (imc[0] < 25) {
            // if(imc[0]<25){
            Resultado.setText(imc[0] + "");
            Descripcion.setText("PESO ADECUADO");
            //img1.setImageResource(R.drawable.download);

        } else if (imc[0] < 35) {
            //if(imc[0]<35){
            Resultado.setText(imc[0] + "");
            Descripcion.setText("SOBREPESO");
        }

            Intent i = new Intent(this , Main2Activity.class);
            i.putExtra("dato",Resultado.getText().toString() +"\nESTA EN: "+ Descripcion.getText().toString());
           // i.putExtra("dato2",Descripcion.getText().toString());
            startActivity(i);

        }
    }


