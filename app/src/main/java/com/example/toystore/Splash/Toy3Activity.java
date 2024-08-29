package com.example.toystore.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.toystore.R;
import com.example.toystore.SignInPages.SignIn1Activity;
import com.example.toystore.SignInPages.SignUpActivity;

public class Toy3Activity extends AppCompatActivity {

    ImageView back3;
    Button gettingStarted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toy3);

        back3 = findViewById(R.id.back3);
        gettingStarted = findViewById(R.id.nextT3);

        back3.setOnClickListener(v -> finish());
        gettingStarted.setOnClickListener(v -> startActivity(new Intent(Toy3Activity.this, SignUpActivity.class)));
    }
}