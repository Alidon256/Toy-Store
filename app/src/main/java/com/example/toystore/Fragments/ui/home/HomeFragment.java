package com.example.toystore.Fragments.ui.home;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.toystore.Fragments.ui.home.HomeFragments.ExchangeFragment;
import com.example.toystore.Fragments.ui.home.HomeFragments.GiveAwayFragment;
import com.example.toystore.Fragments.ui.home.HomeFragments.PaidFragment;
import com.example.toystore.R;
import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {

    ImageView searchBtn;
    private TabLayout tabLayout;
    private FragmentManager fragmentManager;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        tabLayout = view.findViewById(R.id.tab_layout);
        searchBtn = view.findViewById(R.id.imageView7);
        fragmentManager = getChildFragmentManager();

        searchBtn.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Search on the way...", Toast.LENGTH_SHORT).show();
        });

        // Add initial fragment
        if (savedInstanceState == null) {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, new ExchangeFragment())
                    .commit();
        }

        // Set up TabLayout with a listener
     tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        replaceFragment(new ExchangeFragment());
                        break;
                    case 1:
                        replaceFragment(new PaidFragment());
                        break;
                    case 2:
                        replaceFragment(new GiveAwayFragment());
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // No action needed
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // No action needed
            }
        });

        // Initialize tabs
        tabLayout.addTab(tabLayout.newTab().setText("Exchange"));
        tabLayout.addTab(tabLayout.newTab().setText("Paid"));
        tabLayout.addTab(tabLayout.newTab().setText("GiveAway"));

        return view;
    }


    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null); // Optional: adds the transaction to the back stack
        transaction.commit();
    }
}
