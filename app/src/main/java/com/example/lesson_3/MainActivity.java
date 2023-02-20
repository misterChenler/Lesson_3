package com.example.lesson_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> foodList=new ArrayList<>();
    private FoodAdapter adapter=new FoodAdapter(foodList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_View);
        loadData();
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        foodList.add("Minekraft");
        foodList.add("FreFire");
        foodList.add("AmongAs");
        foodList.add("FortNite");
        foodList.add("WorlOfTenks");
        foodList.add("Kelli");
        foodList.add("nall");
        foodList.add("food");
    }
}