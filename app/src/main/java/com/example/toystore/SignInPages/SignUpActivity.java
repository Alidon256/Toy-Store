package com.example.toystore.SignInPages;

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

public class SignUpActivity extends AppCompatActivity {
Button signUp;
TextView signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signUp = findViewById(R.id.signup1);
        signIn = findViewById(R.id.signin1);

        signUp.setOnClickListener(v -> startActivity(new Intent(SignUpActivity.this, SignIn1Activity.class)));
        signIn.setOnClickListener(v -> startActivity(new Intent(SignUpActivity.this, SignIn2Activity.class)));

    }
}