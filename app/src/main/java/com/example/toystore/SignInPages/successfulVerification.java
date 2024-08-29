package com.example.toystore.SignInPages;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import androidx.appcompat.app.AppCompatActivity;


import com.example.toystore.Fragments.MainFragmentActivity;

import com.example.toystore.R;

public class successfulVerification extends AppCompatActivity {
    private static final int VERIFICATION_DELAY = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_verification);
runOnUiThread(() -> new Handler().postDelayed(() -> startActivity(new Intent(successfulVerification.this, MainFragmentActivity.class)),VERIFICATION_DELAY));
    }
}