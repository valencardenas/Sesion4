package com.example.valentina.notas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eExpo,eproye, ePrac,eFinal;
    Button bCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eExpo=(EditText) findViewById(R.id.eExpo);
        eproye=(EditText) findViewById(R.id.eProye);
        ePrac=(EditText) findViewById(R.id.ePrac);
        eFinal=(EditText)findViewById(R.id.eFinal);
        bCalcular=(Button) findViewById(R.id.bCalcular);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double exp,prac,pro,nfinal;

                exp=Double.parseDouble((eExpo.getText().toString()));
                prac=Double.parseDouble((ePrac.getText().toString()));
                pro=Double.parseDouble((eproye.getText().toString()));

                nfinal= 0.15*exp +0.5*prac +0.35*pro;

                eFinal.setText(String.valueOf(nfinal));



            }
        });
    }
}
