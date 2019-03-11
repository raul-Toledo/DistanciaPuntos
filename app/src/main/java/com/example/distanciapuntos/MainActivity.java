package com.example.distanciapuntos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtX1, edtX2, edtY1, edtY2;
    Button btnCalc, btnLimp;
    TextView txvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtX1 = (EditText)findViewById(R.id.edtX1);
        edtX2 = (EditText)findViewById(R.id.edtX2);
        edtY1 = (EditText)findViewById(R.id.edtY1);
        edtY2 = (EditText)findViewById(R.id.edtY2);
        txvResultado = (TextView)findViewById(R.id.txvResul);
        btnCalc = (Button)findViewById(R.id.btnCalcular);
        btnLimp = (Button)findViewById(R.id.btnLimpiar);

        btnLimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtX1.setText("");
                edtY1.setText("");
                edtX2.setText("");
                edtY2.setText("");
                txvResultado.setText("Resultado");
            }
        });

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double dblX1, dblX2, dblY1, dblY2, dblResul;
                dblX1 = Double.valueOf(edtX1.getText().toString());
                dblY1 = Double.valueOf(edtY1.getText().toString());
                dblX2 = Double.valueOf(edtX2.getText().toString());
                dblY2 = Double.valueOf(edtY2.getText().toString());
                dblResul = Math.pow((dblX2-dblX1),2)+Math.pow((dblY2-dblY1),2);
                dblResul = Math.sqrt(dblResul);
                txvResultado.setText(dblResul.toString());
            }
        });
    }
}
