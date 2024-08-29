package com.example.toystore.Fragments.ui.home.HomeFragments.Request;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.toystore.Fragments.ui.home.HomeFragments.UploadActivities.ImageUpload2;
import com.example.toystore.R;

public class RequestActivity2 extends AppCompatActivity {
ImageView arrowBack;
Button addToChat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request2);

        addToChat = findViewById(R.id.addToChat1);

        addToChat.setOnClickListener(v -> startActivity(new Intent(RequestActivity2.this, ImageUpload2.class)));

        arrowBack = findViewById(R.id.arrow_back2);
        arrowBack.setOnClickListener(v -> finish());


    }
}