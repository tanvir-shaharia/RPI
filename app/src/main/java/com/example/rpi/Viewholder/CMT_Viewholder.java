package com.example.rpi.Viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rpi.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class CMT_Viewholder extends RecyclerView.ViewHolder {
    public TextView name,title;
    public CircleImageView imageView;
    public AppCompatButton button;
    public CMT_Viewholder(@NonNull View itemView) {
        super(itemView);
       name=itemView.findViewById(R.id.name);
       title=itemView.findViewById(R.id.title);
       imageView=itemView.findViewById(R.id.profile_image);
       button=itemView.findViewById(R.id.button);
    }
}
