package com.example.toystore.Fragments.ui.home.HomeFragments.Request;

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

import com.example.toystore.Fragments.ui.home.HomeFragments.UploadActivities.ImageUpload3;
import com.example.toystore.R;

public class RequestActivity3 extends AppCompatActivity {
ImageView arrowBack;
Button swap,add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request3);

        arrowBack = findViewById(R.id.arrow_back);
        swap = findViewById(R.id.button3);
        add = findViewById(R.id.add);

        arrowBack.setOnClickListener(v -> finish());
        add.setOnClickListener(v -> startActivity(new Intent(RequestActivity3.this, ImageUpload3.class)));

    }
}