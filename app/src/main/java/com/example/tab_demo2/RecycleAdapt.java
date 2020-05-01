package com.example.tab_demo2;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleAdapt extends RecyclerView.Adapter<RecycleAdapt.Viewholder> {

    Activity context;
    List<Data> list;
    public RecycleAdapt(Activity context, List<Data> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = context.getLayoutInflater().inflate(R.layout.recycle_layout,parent,false);
        return new Viewholder(v);
    }
    ///
    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        Data data = list.get(position);
        holder.image.setImageDrawable(context.getDrawable(data.getImg()));
        holder.product.setText(data.getpName());
        holder.brand.setText(data.getbName());
        holder.price.setText( +data.getPrice()+"");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView product,brand,price;
        ImageView image;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            product = itemView.findViewById(R.id.product);
            brand = itemView.findViewById(R.id.brand);
            price = itemView.findViewById(R.id.price);
        }
    }
}
