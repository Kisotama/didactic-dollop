package com.example.basic1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt;
    Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = findViewById(R.id.button);
        
        bt2 = findViewById(R.id.button2);

        
        bt2.setOnClickListener(v ->{
            Toast.makeText(this, "No Please there're none", Toast.LENGTH_SHORT).show();
        });
        bt.setOnClickListener(v ->{

            Toast.makeText(this, "Entering Idk1", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Idk1.class);
            startActivity(intent);
            
        });
    }
}