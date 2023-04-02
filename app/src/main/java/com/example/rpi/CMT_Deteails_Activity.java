package com.example.rpi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.rpi.databinding.ActivityCmtDeteailsBinding;

public class CMT_Deteails_Activity extends AppCompatActivity {

    Intent intent;
    ActivityCmtDeteailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCmtDeteailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
         intent=getIntent();
        String nam =intent.getStringExtra("name");
        String eml =intent.getStringExtra("email");
        String phn =intent.getStringExtra("phone");
        binding.name.setText(nam);
        binding.email.setText(eml);
        binding.phone.setText(phn);
        binding.email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"+eml)); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_SUBJECT,"subject");
                intent.putExtra(Intent.EXTRA_TEXT,"body");
                startActivity(intent);
            }
        });
        binding.phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+phn)); // only email apps should handle this
                startActivity(intent);
            }
        });
        binding.massage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("smsto:"+phn)); // only email apps should handle this
                startActivity(intent);
            }
        });
    }
}