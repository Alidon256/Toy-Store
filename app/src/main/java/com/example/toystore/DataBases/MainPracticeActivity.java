package com.example.toystore.DataBases;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.example.toystore.R;

import java.util.ArrayList;

public class MainPracticeActivity extends AppCompatActivity {
    private ArrayList<String> studentName,studentRegNumber,StudentEmail;
    private MyAdapter myAdapter;
    private DBHelper dbHelper;
    private RecyclerView recyclerView;
    private ItemTouchHelper itemTouchHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_practice);

        dbHelper = new DBHelper(this);
        studentName = new ArrayList<>();
        studentRegNumber = new ArrayList<>();
        StudentEmail = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);

        myAdapter = new MyAdapter(this, studentName, studentRegNumber, StudentEmail);
        recyclerView.setAdapter(myAdapter);

        itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);

    }
        ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                int position = viewHolder.getAdapterPosition();
                switch (direction) {
                    case ItemTouchHelper.LEFT:
                        dbHelper.deleteData(position);
                        studentName.remove(position);
                        studentRegNumber.remove(position);
                        StudentEmail.remove(position);
                        myAdapter.notifyItemRemoved(position);
                        break;
                    case ItemTouchHelper.RIGHT:
                        Toast.makeText(MainPracticeActivity.this, "Right", Toast.LENGTH_SHORT).show();
                }

            }
        };

}