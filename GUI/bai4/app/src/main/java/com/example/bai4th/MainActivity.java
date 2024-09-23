package com.example.bai4th;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button  btnTinh;
    EditText txtTen,txtCannang,txtChieucao,txtKqBMI,txtChuandoanBMI;
    Float a,b,c;
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
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Float.parseFloat(txtChieucao.getText().toString());
                b=Float.parseFloat(txtCannang.getText().toString());
                c=b/(a*a);
                txtKqBMI.setText(String.valueOf(c));
                if(c<18){
                    txtChuandoanBMI.setText("Bạn gầy!");
                } else if (c<=24.9) {
                    txtChuandoanBMI.setText("Bạn bình thường!");
                } else if (c<=29.9) {
                    txtChuandoanBMI.setText("Bạn bị béo phì cấp độ 1");
                }else if (c<=34.9){
                    txtChuandoanBMI.setText("Bạn bị béo phì cấp độ 2");
                } else{
                    txtChuandoanBMI.setText( "Bạn bị béo phì cấp độ 3");
                }
            }
        });
    }
    public void init()
    {
        btnTinh=findViewById(R.id.btnTinh);
        txtTen=findViewById(R.id.txtTen);
        txtChieucao=findViewById(R.id.txtChieucao);
        txtCannang=findViewById(R.id.txtCannang);
        txtKqBMI=findViewById(R.id.txtKqBMI);
        txtChuandoanBMI=findViewById(R.id.txtChuandoanBMI);
    }
}