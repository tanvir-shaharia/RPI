package com.example.rpi.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rpi.CMT_Deteails_Activity;
import com.example.rpi.CMT_Model;
import com.example.rpi.R;
import com.example.rpi.Viewholder.CMT_Viewholder;

import java.util.List;

public class CMT_Adapter extends RecyclerView.Adapter<CMT_Viewholder> {
    Context context;
    List<CMT_Model> cmt_modelList;

    public CMT_Adapter(Context context, List<CMT_Model> cmt_modelList) {
        this.context = context;
        this.cmt_modelList = cmt_modelList;
    }
    @NonNull
    @Override
    public CMT_Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.cmt_item,parent,false);
        return new CMT_Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CMT_Viewholder holder, int position) {
        CMT_Model cmt_model=cmt_modelList.get(position);
        holder.name.setText(cmt_model.getName());
        holder.title.setText(cmt_model.getTitle());
        holder.button.setOnClickListener(v -> {
            Intent intent=new Intent(context, CMT_Deteails_Activity.class);
            intent.putExtra("name",cmt_model.getName());
            intent.putExtra("email",cmt_model.getEmail());
            intent.putExtra("phone",cmt_model.getPhone());
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return cmt_modelList.size();
    }

}
