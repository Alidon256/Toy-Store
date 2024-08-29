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
import com.example.toystore.Fragments.ui.home.HomeFragments.Adapters.PaidAdapter;
import com.example.toystore.Fragments.ui.home.HomeFragments.Models.ExchangeModel;
import com.example.toystore.Fragments.ui.home.HomeFragments.Models.PaidModel;
import com.example.toystore.R;
import com.example.toystore.databinding.FragmentPaidBinding;

import java.util.ArrayList;


public class PaidFragment extends Fragment {
    FragmentPaidBinding binding;
    private ArrayList<PaidModel> list1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPaidBinding.inflate(inflater,container,false);
        return  binding.getRoot();
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initializeRecyclerView();
        ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {

                int position = viewHolder.getAdapterPosition();
                switch ((direction)){
                    case ItemTouchHelper.LEFT:
                        Toast.makeText(getContext(), "In You can buy any paid payment😁", Toast.LENGTH_SHORT).show();
                        list1.remove(position);
                        binding.idRecycler1.getAdapter().notifyItemRemoved(position);
                        break;
                    case ItemTouchHelper.RIGHT:
                        Toast.makeText(getContext(), "Don't worry everything will be okay😁", Toast.LENGTH_SHORT).show();
                        list1.remove(position);
                        binding.idRecycler1.getAdapter().notifyItemRemoved(position);
                        break;
                }
            }
        };
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(binding.idRecycler1);
    }

    private void initializeRecyclerView() {
        list1 = new ArrayList<>();
        list1.add(new PaidModel("RC Jeep","3km","Exchange Price","$30","$40",R.drawable.ic_jeep));
        list1.add(new PaidModel("Excavators","6km","Exchange Price","$40","$50",R.drawable.ic_excavator));
        list1.add(new PaidModel("Rubic cube","2km","Exchange Price","$35","$40",R.drawable.ic_rubic_cube));
        list1.add(new PaidModel("Ninja Warrior","7km","Exchange Price","$20","$24",R.drawable.ic_ninja_warrior));
        list1.add(new PaidModel("Teddy Bear","8km","Exchange Price","$30","$45",R.drawable.ic_teddy));
        list1.add(new PaidModel("Talking Chicky","2km","Exchange Price","$34","$40",R.drawable.ic_talking_chicky));
        list1.add(new PaidModel("Walking Chicky","7km","Exchange Price","$10","$20",R.drawable.product3));
        list1.add(new PaidModel("Jumping Chicky","8km","Exchange Price","$35","$48",R.drawable.product6));

        PaidAdapter adapter = new PaidAdapter(getContext(),list1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.idRecycler1.setLayoutManager(layoutManager);
        binding.idRecycler1.setAdapter(adapter);
    }
}