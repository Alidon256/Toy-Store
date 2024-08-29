package com.example.toystore.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.toystore.R;

public class Toy1Activity extends AppCompatActivity {
Button nextT1;
TextView skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toy1);

        nextT1 = findViewById(R.id.nextT1);
        skip = findViewById(R.id.Skip);

        runOnUiThread(() -> {
            nextT1.setOnClickListener(v -> startActivity(new Intent(Toy1Activity.this, Toy2Activity.class)));
            skip.setOnClickListener(v -> startActivity(new Intent(Toy1Activity.this, Toy3Activity.class)));
        });

    }
}