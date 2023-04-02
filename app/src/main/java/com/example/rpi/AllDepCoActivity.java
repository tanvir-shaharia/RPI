package com.example.rpi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.rpi.databinding.ActivityAllDepCoBinding;

public class AllDepCoActivity extends AppCompatActivity {

    ActivityAllDepCoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAllDepCoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.cmt.setOnClickListener(v -> {
            startActivity(new Intent(AllDepCoActivity.this,ContractActivity.class));
        });
        binding.ct.setOnClickListener(v -> {
            Toast.makeText(this, "Under Maintence", Toast.LENGTH_SHORT).show();
        }); binding.et.setOnClickListener(v -> {
            Toast.makeText(this, "Under Maintence", Toast.LENGTH_SHORT).show();
        }); binding.ets.setOnClickListener(v -> {
            Toast.makeText(this, "Under Maintence", Toast.LENGTH_SHORT).show();
        }); binding.mt.setOnClickListener(v -> {
            Toast.makeText(this, "Under Maintence", Toast.LENGTH_SHORT).show();
        }); binding.mct.setOnClickListener(v -> {
            Toast.makeText(this, "Under Maintence", Toast.LENGTH_SHORT).show();
        }); binding.pt.setOnClickListener(v -> {
            Toast.makeText(this, "Under Maintence", Toast.LENGTH_SHORT).show();
        }); binding.elt.setOnClickListener(v -> {
            Toast.makeText(this, "Under Maintence", Toast.LENGTH_SHORT).show();
        });
    }
}