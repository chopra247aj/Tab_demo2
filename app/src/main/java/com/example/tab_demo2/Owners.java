package com.example.tab_demo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Owners extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecycleAdapt adapter;
    double[] prices = {1,2};
    String[] product = {"Ajay Chopra","Prince Thakur"};
    String[] brand = {"Android Developer","Flutter Developer"};
    int[] imgage = {R.drawable.ajayphoto,R.drawable.prince};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owners);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecycleAdapt(this,getList());
        recyclerView.setAdapter(adapter);
    }
    public List<Data> getList(){
        List<Data> list = new ArrayList<>();
        for(int i=0;i<product.length && i<brand.length && i<imgage.length;i++){
            Data data = new Data();
            data.setpName(product[i]);
            data.setbName(brand[i]);
            data.setImg(imgage[i]);
            data.setPrice(prices[i]);
            list.add(data);
        }
        return list;
    }
}
