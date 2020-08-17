package com.lionelnkeoua.databiding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.lionelnkeoua.databiding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

       binding.setUser(new User("Lionel NKEOUA", "1081 Rue st anne bis ouenze, brazzaville", "100K", "50K"));
       binding.setEventHandler(new EventHandler(this));
    }
}