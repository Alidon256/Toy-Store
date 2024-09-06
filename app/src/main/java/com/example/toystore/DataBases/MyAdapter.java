package com.example.toystore.DataBases;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.toystore.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<String> studentName,StudentEmail,StudentRegNumber;;

    public MyAdapter(Context context, ArrayList<String> studentName, ArrayList<String> studentEmail, ArrayList<String> studentRegNumber) {
        this.context = context;
        this.studentName = studentName;
        StudentEmail = studentEmail;
        StudentRegNumber = studentRegNumber;
    }

    public MyAdapter() {
        super();
    }


    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
      holder.studentName.setText(studentName.get(position));
        holder.StudentEmail.setText(StudentEmail.get(position));
        holder.StudentRegNumber.setText(StudentRegNumber.get(position));
    }

    @Override
    public int getItemCount() {
      return studentName.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView studentName,StudentEmail,StudentRegNumber;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            studentName = itemView.findViewById(R.id.textView20);
            StudentEmail = itemView.findViewById(R.id.StudentEmail);
            StudentRegNumber = itemView.findViewById(R.id.StudentNumber);
        }
    }
}
