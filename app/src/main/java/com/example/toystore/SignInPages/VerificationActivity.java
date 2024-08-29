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

public class VerificationActivity extends AppCompatActivity {

    Button verify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        verify = findViewById(R.id.verify);
        verify.setOnClickListener(v -> startActivity(new Intent(VerificationActivity.this, successfulVerification.class)));
    }
}