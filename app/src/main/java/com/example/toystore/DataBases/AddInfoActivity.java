package com.example.toystore.DataBases;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.toystore.R;

import java.util.ArrayList;

public class AddInfoActivity extends AppCompatActivity {
    private EditText StudentName,StudentRegNumber,StudentEmail;
   private  DBHelper dbHelper;
   private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_info);

        dbHelper = new DBHelper(AddInfoActivity.this);
        StudentName = findViewById(R.id.editTextText2);
        StudentRegNumber = findViewById(R.id.editTextText3);
        StudentEmail = findViewById(R.id.editTextText4);
        button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            String studentName = StudentName.getText().toString();
            String studentRegNumber = StudentRegNumber.getText().toString();
            String studentEmail = StudentEmail.getText().toString();

            boolean isSuccessfull = dbHelper.insertData(studentName,studentRegNumber,studentEmail);
            if(isSuccessfull){
                Toast.makeText(AddInfoActivity.this, "Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                StudentName.setText("");
                StudentRegNumber.setText("");
                StudentEmail.setText("");
            }else{
                Toast.makeText(AddInfoActivity.this, "Something Went Wrong", Toast.LENGTH_SHORT).show();
            }
            finish();

        });


    }
}