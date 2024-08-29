package com.example.toystore.Fragments.ui.home.HomeFragments.Request;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.toystore.Fragments.ui.home.HomeFragments.UploadActivities.ImageUpload1;
import com.example.toystore.R;

public class RequestActivity extends AppCompatActivity {
    ImageView arrowBack;
    Button addToChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        String setName = getIntent().getStringExtra("Toy");
        arrowBack = findViewById(R.id.arrow_back);
        addToChat = findViewById(R.id.nextT1);
        addToChat.setOnClickListener(v -> startActivity(new Intent(RequestActivity.this, ImageUpload1.class)));

        arrowBack.setOnClickListener(v -> finish());

        if (setName.equals("RC Jeep")) {
            jeep();
        } else if (setName.equals("Excavators")) {
            excavator();
        } else if (setName.equals("Rubic cube")) {
            cube();
        } else if (setName.equals("Ninja Warrior")) {
            NinjaWarrior();
        } else if (setName.equals("Teddy Bear")) {
            TeddyBear();
        } else if (setName.equals("Talking Chicky")) {
            TalkingChicky();
        } else if (setName.equals("Talking Chicky")) {
        }
    }

    private void TalkingChicky() {
    }

    private void TeddyBear() {
    }

    private void NinjaWarrior() {
    }

    private void cube() {
        startActivity(new Intent(RequestActivity.this,RequestActivity3.class));
    }

    private void excavator() {
        startActivity(new Intent(RequestActivity.this,RequestActivity2.class));
    }

    private void jeep() {

       // startActivity(new Intent(this,RequestActivity.class));
    }
}