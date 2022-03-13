package com.kamesh.usellup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.HorizontalScrollView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewCategory;
    CategoryAdapter categoryAdapter;

    GridView gridViewProducts;
    ProductAdapter productAdapter;

    RecyclerView recyclerViewProfiles;
    ProfileAdapter profileAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoryAdapter = new CategoryAdapter(getApplicationContext());
        recyclerViewCategory =  findViewById(R.id.recyclerViewCategory);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
        recyclerViewCategory.setAdapter(categoryAdapter);

        gridViewProducts = findViewById(R.id.gridViewProducts);
        productAdapter = new ProductAdapter(getApplicationContext());
        gridViewProducts.setAdapter(productAdapter);

        profileAdapter = new ProfileAdapter(getApplicationContext());
        recyclerViewProfiles =  findViewById(R.id.recyclerViewProfiles);
        recyclerViewProfiles.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
        recyclerViewProfiles.setAdapter(profileAdapter);

    }
}