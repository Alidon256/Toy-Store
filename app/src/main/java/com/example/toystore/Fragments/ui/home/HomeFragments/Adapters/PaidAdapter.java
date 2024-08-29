package com.example.toystore.Fragments.ui.home.HomeFragments.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.toystore.Fragments.ui.home.HomeFragments.Models.PaidModel;
import com.example.toystore.Fragments.ui.home.HomeFragments.Request.RequestActivity;
import com.example.toystore.R;
import com.example.toystore.databinding.ItemPaidBinding;

import java.util.ArrayList;

public class PaidAdapter extends RecyclerView.Adapter<PaidAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<PaidModel> list;

    public PaidAdapter(Context context, ArrayList<PaidModel> list) {
        this.context = context;
        this.list = list;
    }
    public  PaidAdapter(){

    }

    @NonNull
    @Override
    public PaidAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.item_paid,parent,false);
       return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PaidAdapter.MyViewHolder holder, int position) {

        final PaidModel model = list.get(position);
        holder.binding.productName.setText(model.getProductName());
        holder.binding.distance.setText(model.getDistance());
        holder.binding.productDescription.setText(model.getExchangePrice());
        holder.binding.BoldPrice.setText(model.getBoldPrice());
        holder.binding.NBoldPrice.setText(model.getNoBoldPrice());
        holder.binding.imageView5.setImageResource(model.getImageResourceID());
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, RequestActivity.class);
            intent.putExtra("Toy",model.getProductName());
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ItemPaidBinding binding;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemPaidBinding.bind(itemView);
        }
    }
}
