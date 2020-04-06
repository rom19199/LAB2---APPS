package com.example.imc_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;
    private ImageView im1;
    private  ImageView im2;
    private  ImageView im3;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView)findViewById(R.id.tvResultados);
        String dato = getIntent().getStringExtra("dato");
        String dato2 = getIntent().getStringExtra("dato2");
        tv1.setText("Su IMC es: "+dato);
        im1 = (ImageView)findViewById(R.id.img_Ideal);
        im2 = (ImageView)findViewById(R.id.img_Ideal);
        im3 = (ImageView)findViewById(R.id.img_Ideal);
        if(dato.contains("PESO ADECUADO")){
            im1.setImageResource(R.drawable.download);
        }
        if(dato.contains("BAJO PESO")){
            im1.setImageResource(R.drawable.faltapeso);
        }
       if(dato.contains("SOBREPESO")){
            im1.setImageResource(R.drawable.images);
       }

       // tv2 = (TextView)findViewById(R.id.tvDescripcion);
        //String dato2 = getIntent().getStringExtra("dato2");
        //tv1.setText("Esta en: "+dato2);

    }
}
