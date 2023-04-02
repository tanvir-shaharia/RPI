package com.example.rpi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.example.rpi.Adapter.CMT_Adapter;
import com.example.rpi.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.dept.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,DeptActivity.class);
            startActivity(intent);
        });
        binding.contract.setOnClickListener(v -> {
           startActivity(new Intent(MainActivity.this,AllDepCoActivity.class));
        });
        binding.notice.setOnClickListener(v -> {

            Toast.makeText(this, "'Notice' is Upcoming Features!", Toast.LENGTH_SHORT).show();

        });
        binding.web.setOnClickListener(v -> {
            Toast.makeText(this, "'Web' is Upcoming Features!", Toast.LENGTH_SHORT).show();


        });
        binding.result.setOnClickListener(v -> {
            Toast.makeText(this, "'Result' is Upcoming Features!", Toast.LENGTH_SHORT).show();


        });
        binding.sitplan.setOnClickListener(v -> {
            Toast.makeText(this, "Upcoming Features!", Toast.LENGTH_SHORT).show();


        });
        binding.routine.setOnClickListener(v -> {
            Toast.makeText(this, "Upcoming Features!", Toast.LENGTH_SHORT).show();


        });
        binding.cgpa.setOnClickListener(v -> {
            Toast.makeText(this, "Upcoming Features!", Toast.LENGTH_SHORT).show();


        });
        binding.upmore.setOnClickListener(v -> {
            Toast.makeText(this, "Upcoming Features!", Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public void onBackPressed() {

            showalert();

    }
    public void showalert(){
        AlertDialog.Builder builder =new AlertDialog.Builder(MainActivity.this);
        builder.setIcon(R.drawable.rpilogo);
        builder.setTitle("Exit");
        builder.setMessage("Are you sure to Exit");
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        AlertDialog dialog =builder.create();
        dialog.show();
    }
}