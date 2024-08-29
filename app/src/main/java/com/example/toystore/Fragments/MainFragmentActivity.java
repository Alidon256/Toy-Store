package com.example.toystore.Fragments;

import android.os.Bundle;

import com.example.toystore.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.toystore.databinding.ActivityMainFragmentBinding;

public class MainFragmentActivity extends AppCompatActivity {

    private boolean hasNavigateFromInitialFragment = false;
    private int initialFragmentId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);



        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main_fragment);

        initialFragmentId =R.id.navigation_home;

        navView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if(!hasNavigateFromInitialFragment && itemId == initialFragmentId) {
             return false;
            }
            if(itemId == R.id.navigation_home) {
                hasNavigateFromInitialFragment = true;
                navController.navigate(R.id.navigation_homeAc);
            } else if(itemId == R.id.navigation_shop) {
                navController.navigate(R.id.navigation_shopAc);
            } else if(itemId == R.id.navigation_dashboard) {
                navController.navigate(R.id.navigation_dashboardAc);
            }else if(itemId == R.id.navigation_messages) {
                navController.navigate(R.id.navigation_messagesAc);
            }   else if(itemId == R.id.navigation_notifications) {
                navController.navigate(R.id.navigation_notificationsAc);
            }
            hasNavigateFromInitialFragment =true;
            return true;
                });

        if (savedInstanceState == null){
            navController.navigate(initialFragmentId);
        }

    }

}