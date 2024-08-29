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

public class SignIn2Activity extends AppCompatActivity {

    Button signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in2);

        signIn = findViewById(R.id.signIn2);

        signIn.setOnClickListener(v -> startActivity(new Intent(SignIn2Activity.this,successfulVerification.class)));
    }
}