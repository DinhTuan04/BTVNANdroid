package com.example.xucxac;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imgDice;
    Button btnRoll;
    Random ran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View rootView = findViewById(R.id.main);
        if (rootView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(rootView, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }
        initControls();
        btnRoll.setOnClickListener(view -> {
            int number = ran.nextInt(6) + 1;
            int resId = getResources().getIdentifier("dice" + number, "drawable", getPackageName());
            imgDice.setImageResource(resId);
        });
    }

    private void initControls() {
        imgDice=findViewById(R.id.imgDice);
        btnRoll = findViewById(R.id.btnRoll);
        ran = new Random();
    }
}