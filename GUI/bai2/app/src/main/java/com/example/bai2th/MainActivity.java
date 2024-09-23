package com.example.bai2th;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText txtC,txtF;
    Button btnCtoF,btnFtoC;
    Float num1,num2,doC,doF;
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
        init();
        btnFtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!txtF.getText().toString().trim().equals(""))
                {
                    num1=Float.parseFloat(txtF.getText().toString());
                    doC=(num1-32)*5/9;
                    txtC.setText(String.valueOf(doC));
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Hãy nhập dữ liệu",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnCtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!txtC.getText().toString().trim().equals(""))
                {
                    num2 = Float.parseFloat(txtC.getText().toString());
                    doF = num2 *9/5+32;
                    txtF.setText(String.valueOf(doF));
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Hãy nhập dữ liệu",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void init()
    {
        txtC=findViewById(R.id.txtC);
        txtF=findViewById(R.id.txtF);
        btnCtoF=findViewById(R.id.btnCtoF);
        btnFtoC=findViewById(R.id.btnFtoC);
    }
}