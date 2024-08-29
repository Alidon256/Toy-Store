package com.example.toystore.Fragments.ui.home.HomeFragments.UploadActivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.toystore.Fragments.ui.home.HomeFragments.Request.RequestActivity3;
import com.example.toystore.R;

public class ImageUpload3 extends AppCompatActivity {

    ImageView arrowBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_upload3);
        arrowBack = findViewById(R.id.arrow_back);

        arrowBack.setOnClickListener(v -> finish());
    }
}