package com.lionelnkeoua.databiding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.lionelnkeoua.databiding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

       binding.tvAddress.setText("1081 Rue st anne bis ouenze, brazzaville");
       binding.tvFollowers.setText("100K");
       binding.tvfollowing.setText("50K");
       binding.tvName.setText("Lionel NKEOUA");

    }
}