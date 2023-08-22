package com.example.aibot.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aibot.AiModel_Activity;
import com.example.aibot.Models.Modelclass;
import com.example.aibot.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    Context context;
    List<Modelclass> modelclasses;
    LayoutInflater inflater;

    public Adapter(Context context, List<Modelclass> modelclasses, LayoutInflater inflater) {
        this.context = context;
        this.modelclasses = modelclasses;
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.carddesign,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Modelclass model=modelclasses.get(position);
    holder.imageView.setImageResource(model.getImage());
    holder.textView.setText(model.getModelname());
    holder.cardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           String path[]=context.getResources().getStringArray(R.array.path);
           Intent intent=new Intent(context, AiModel_Activity.class);
           intent.putExtra("pathpos",path[position]);
           intent.putExtra("pos",position);
                       context.startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount() {
        return modelclasses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
 CardView cardView;
 ImageView imageView;
 TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView=itemView.findViewById(R.id.cardmain);
            textView=itemView.findViewById(R.id.textcard);
            imageView=itemView.findViewById(R.id.imagecard);
        }
    }
}
