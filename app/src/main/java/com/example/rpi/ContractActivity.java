package com.example.rpi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.rpi.Adapter.CMT_Adapter;

import java.util.ArrayList;
import java.util.List;

public class ContractActivity extends AppCompatActivity {

    List<CMT_Model> cmt_models;
    RecyclerView recyclerView;
    CMT_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contract);

        cmt_models=new ArrayList<>();
        cmt_models.add(new CMT_Model("Md. Abdur Rashid ","Chief Instructor","hello",": marashid89@yahoo.com",": 01552498515"));
        cmt_models.add(new CMT_Model("Nasrin Akter","Chief Instructor 2nd Shift","hello","nasrin.papri@gmail.com","01716303402"));
        cmt_models.add(new CMT_Model(".Md.Faruk Hossain","Instructor","hello","smfalfaruk.ice.ru@gmail.com",":0150441029"));
        cmt_models.add(new CMT_Model("Womme  Kulsum "," Instructor","hello","kulsum.ahnaf@gmail.com","01760400071"));
        cmt_models.add(new CMT_Model("Md.Asaduzzaman  Prodhan"," Instructor","hello","asad07ete@gmail.com","01957890146"));
        cmt_models.add(new CMT_Model("Md.Fazlul Haque","Junior  Instructor","hello","f.haque2009eng@gmail.com","01913540578"));
        cmt_models.add(new CMT_Model(".Mst.Jorina  Khatun","Junior  Instructor","hello","jorijorina2@gmail.com","01721271721"));
        cmt_models.add(new CMT_Model("MD Shakil Uddin","Instructor","hello","sucuetcse@gmail.com","01837298165"));
        cmt_models.add(new CMT_Model("Mr ","Instructor","hello","",""));
        cmt_models.add(new CMT_Model("Mr","Instructor","hello","",""));
        cmt_models.add(new CMT_Model("Mr","Instructor","hello","",""));
        cmt_models.add(new CMT_Model("Mr","Instructor","hello","",""));
        cmt_models.add(new CMT_Model("Mr","Instructor","hello","",""));
        cmt_models.add(new CMT_Model("Mr","Instructor","hello","",""));
        cmt_models.add(new CMT_Model("Mr","Instructor","hello","",""));

        recyclerView=findViewById(R.id.rechyler);


        adapter = new CMT_Adapter(ContractActivity.this,cmt_models);
        recyclerView.setAdapter(adapter);
    }
}