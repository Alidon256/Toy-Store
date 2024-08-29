package com.example.toystore.Fragments.ui.home.HomeFragments.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.toystore.Fragments.ui.home.HomeFragments.Models.ExchangeModel;
import com.example.toystore.Fragments.ui.home.HomeFragments.Request.RequestActivity;
import com.example.toystore.R;
import com.example.toystore.databinding.ItemExchangeBinding;

import java.util.ArrayList;

public class ExchangeAdapter extends RecyclerView.Adapter<ExchangeAdapter.MyviewHolder> {
    Context context;
    ArrayList<ExchangeModel> list;

    public ExchangeAdapter(Context context, ArrayList<ExchangeModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ExchangeAdapter.MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_exchange,parent,false);
        return  new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExchangeAdapter.MyviewHolder holder, int position) {

        final ExchangeModel model = list.get(position);
        holder.binding.productName.setText(model.getProductName());
        holder.binding.productDescription.setText(model.getProductDescription());
        holder.binding.distance.setText(model.getDistance());
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

    public class MyviewHolder extends RecyclerView.ViewHolder {
        ItemExchangeBinding binding;
        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemExchangeBinding.bind(itemView);
        }


    }
}
