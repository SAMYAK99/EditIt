package com.projects.editit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.projects.editit.databinding.ActivityResultBinding;

public class Result extends AppCompatActivity {

    ActivityResultBinding  binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityResultBinding.inflate(getLayoutInflater()) ;
        setContentView(binding.getRoot());

        binding.imageView5.setImageURI(getIntent().getData());
    }
}