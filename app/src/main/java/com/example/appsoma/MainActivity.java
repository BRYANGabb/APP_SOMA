package com.example.appsoma;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void somarValores(View view) {
        //recuperar componentes
        EditText edValor1 = (EditText) findViewById(R.id.valor1);
        EditText edValor2 = (EditText) findViewById(R.id.valor2);

        //recupera os valores e faz a soma
        double valor1 = Double.parseDouble (edValor1.getText().toString());
        double valor2 = Double.parseDouble (edValor2.getText().toString());
        double resultado = valor1 + valor2;

        //guarda o resultado
        TextView txResultado = (TextView) findViewById(R.id.resultado);
        txResultado.setText("O valor da soma = " + resultado);


    }
}