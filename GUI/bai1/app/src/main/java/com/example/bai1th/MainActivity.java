package com.example.bai1th;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView txtKq;
    EditText txtA,txtB;
    Integer num1,num2;
    Button btnTong,btnHieu,btnTich,btnThuong,btnUcln,btnThoat;
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
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(txtA.getText().toString());
                num2=Integer.parseInt(txtB.getText().toString());
                txtKq.setText(String.valueOf(num1+num2));
            }
        });
        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(txtA.getText().toString());
                num2=Integer.parseInt(txtB.getText().toString());
                txtKq.setText(String.valueOf(num1-num2));
            }
        });
        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(txtA.getText().toString());
                num2=Integer.parseInt(txtB.getText().toString());
                txtKq.setText(String.valueOf(num1*num2));
            }
        });
        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(txtA.getText().toString());
                num2=Integer.parseInt(txtB.getText().toString());
                txtKq.setText(String.valueOf(num1/num2));
            }
        });
        btnUcln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(txtA.getText().toString());
                num2=Integer.parseInt(txtB.getText().toString());
                txtKq.setText(String.valueOf(gcd(num1,num2)));
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void init()
    {
        txtA=findViewById(R.id.txtA);
        txtB=findViewById(R.id.txtB);
        txtKq=findViewById(R.id.txtKq);
        btnTong=findViewById(R.id.btnTong);
        btnHieu=findViewById(R.id.btnHieu);
        btnTich=findViewById(R.id.btnTich);
        btnThuong=findViewById(R.id.btnThuong);
        btnUcln=findViewById(R.id.btnUcln);
        btnThoat=findViewById(R.id.btnThoat);
    }
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}