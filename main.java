package com.example.aaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtFar,txtCel;
    Button btnCel,btnFar,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        txtFar=  findViewById(R.id.txtFar);
        txtCel=  findViewById(R.id.txtCel);
        btnCel  =  findViewById(R.id.btnCel);
        btnFar  =  findViewById(R.id.btnFar);
        btnClear  =  findViewById(R.id.btnClear);
        btnCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(txtFar.getText().toString());
                double kq = a * 9/5 + 32 ;
                txtCel.setText(String.valueOf(kq));
            }
        });
        btnFar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {.  r
                double b = Double.parseDouble(txtCel.getText().toString());
                double kqq = (b - 32) * 5/9 ;
                txtFar.setText(String.valueOf(kqq));
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFar.setText("");
                txtCel.setText("");
            }
        });
    }

}
