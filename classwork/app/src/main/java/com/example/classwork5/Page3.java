package com.example.classwork5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        ImageView image = findViewById(R.id.image2);
        TextView nameResult = findViewById(R.id.name);
        TextView ageResult = findViewById(R.id.age);
        Bundle bundle = getIntent().getExtras();

        String name = bundle.getString("nb");
        int age = bundle.getInt("ab");
        nameResult.setText(name);
        ageResult.setText(String.valueOf(age));


    }
}