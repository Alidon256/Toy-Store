package com.example.toystore.SignInPages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.toystore.R;

public class SignIn1Activity extends AppCompatActivity {

    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in1);

        signUp = findViewById(R.id.signup11);
        signUp.setOnClickListener(v -> startActivity(new Intent(SignIn1Activity.this, VerificationActivity.class)));

    }
}