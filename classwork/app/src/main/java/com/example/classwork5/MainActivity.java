package com.example.classwork5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.classwork5.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton insertImage = findViewById(R.id.insertPhoto);
        EditText nameInput = findViewById(R.id.nameInput);
        EditText ageInput = findViewById(R.id.ageInput);
        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nameInput.length() == 0)
                {
                    nameInput.setError("Please Enter Your Name!");}
                else {
                    if (ageInput.length() == 0)
                    {
                        ageInput.setError("Please Enter Your Age!");}
                    else{
                    String n = nameInput.getText().toString();
                    int a = Integer.parseInt(ageInput.getText().toString());


                    Intent plane = new Intent(MainActivity.this, Page3.class);

                    plane.putExtra("nb", n);
                    plane.putExtra("ab", a);

                    startActivity(plane);
                }
            }
        }
    });
}
}
