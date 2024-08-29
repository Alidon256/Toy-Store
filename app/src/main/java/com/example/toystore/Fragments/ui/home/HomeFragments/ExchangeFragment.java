package com.example.toystore.Fragments.ui.home.HomeFragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.toystore.Fragments.ui.home.HomeFragments.Adapters.ExchangeAdapter;
import com.example.toystore.Fragments.ui.home.HomeFragments.Models.ExchangeModel;
import com.example.toystore.R;
import com.example.toystore.databinding.FragmentExchangeBinding;

import java.util.ArrayList;

public class ExchangeFragment extends Fragment {
    FragmentExchangeBinding binding;
    ArrayList<ExchangeModel> list;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentExchangeBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initializeRecyclerView();


    }

    private void initializeRecyclerView() {
        list = new ArrayList<>();
        list.add(new ExchangeModel("RC Jeep","RC Cars","3km",R.drawable.ic_jeep));
        list.add(new ExchangeModel("Excavators","Construction Toys","6km",R.drawable.ic_excavator));
        list.add(new ExchangeModel("Rubic cube","Puzzie Toys","2km",R.drawable.ic_rubic_cube));
        list.add(new ExchangeModel("Ninja Warrior","Action Toys","7km",R.drawable.ic_ninja_warrior));
        list.add(new ExchangeModel("Teddy Bear","Shulfed Toy","8km",R.drawable.ic_teddy));
        list.add(new ExchangeModel("Talking Chicky","Anime Toy","2km",R.drawable.ic_talking_chicky));
        list.add(new ExchangeModel("Talking Chicky","Anime Toy","2km",R.drawable.product6));
        list.add(new ExchangeModel("Talking Chicky","Anime Toy","2km",R.drawable.product6));

        ExchangeAdapter adapter = new ExchangeAdapter(getContext(),list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.idRecycler.setLayoutManager(layoutManager);
        binding.idRecycler.setAdapter(adapter);
    }
}
