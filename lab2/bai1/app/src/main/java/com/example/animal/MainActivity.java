package com.example.animal;

import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;
import java.util.List;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    FrameLayout main;
    ImageView img;
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
        main = findViewById(R.id.main);
        img = findViewById(R.id.img);
        List<Integer> list = new ArrayList<Integer>();
            list.add(R.drawable.cho);
            list.add(R.drawable.lon);
            list.add(R.drawable.ga);
            list.add(R.drawable.cuu);
            list.add(R.drawable.bo);
            int a = new Random().nextInt(list.size());
            img.setImageResource(list.get(a));

            int x = new Random().nextInt(256);
            int y = new Random().nextInt(256);
            int z = new Random().nextInt(256);
            main.setBackgroundColor(Color.rgb(x,y,z));
    }
}