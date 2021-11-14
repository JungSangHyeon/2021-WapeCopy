package com.example.wapecopy.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.wapecopy.R;
import com.example.wapecopy.databinding.ActivityMainBinding;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public static final Map<Integer, Integer> MENU_DESTINATION_MAP = new HashMap<Integer, Integer>() {{
        put(R.id.action_home, R.id.action_global_homeFragment);
        put(R.id.action_search, R.id.action_global_searchFragment);
        put(R.id.action_rating, R.id.action_global_ratingFragment);
        put(R.id.action_news, R.id.action_global_newsFragment);
        put(R.id.action_my_watcha, R.id.action_global_myWatchaFragment);
    }};

    private  ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setMenuListener();
    }

    private void setMenuListener() {
        NavController mainNavController = getNavController();
        binding.mainActivityMenu.setOnItemSelectedListener(item -> {
            mainNavController.navigate(MENU_DESTINATION_MAP.get(item.getItemId()));
            return true;
        });
    }

    private NavController getNavController() {
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mainActivity_fragmentContainer);
        return navHostFragment.getNavController();
    }
}