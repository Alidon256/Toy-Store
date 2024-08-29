package com.example.toystore.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.toystore.R;
import com.example.toystore.SignInPages.SignIn1Activity;

public class Toy2Activity extends AppCompatActivity {
    ImageView back;
    Button nextT2;
    TextView skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toy2);

        back = findViewById(R.id.back);
        nextT2 = findViewById(R.id.nextT2);
        skip = findViewById(R.id.Skip2);

        back.setOnClickListener(v -> finish());
        runOnUiThread(() -> {
            nextT2.setOnClickListener(v -> startActivity(new Intent(Toy2Activity.this, Toy3Activity.class)));
            skip.setOnClickListener(v -> startActivity(new Intent(Toy2Activity.this, SignIn1Activity.class)));

        });

    }
}