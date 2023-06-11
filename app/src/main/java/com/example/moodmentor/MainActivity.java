package com.example.moodmentor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.moodmentor.categories.CategoriesAdapter;
import com.example.moodmentor.categories.CategoriesList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<CategoriesList> categoriesLists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView categoriesRecyclerView = findViewById(R.id.categoriesRecyclerView);

        categoriesRecyclerView.setHasFixedSize(true);
        categoriesRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

        //prideti kategorijas i CategoriesList
        CategoriesList sadCategory = new CategoriesList("Sad", R.drawable.sad); //cia traukiam img is drawable package.
        categoriesLists.add(sadCategory); //pridedam sad kategorija i categoriesLists

        CategoriesList happyCategory = new CategoriesList("Happy", R.drawable.happy);
        categoriesLists.add(happyCategory); //pridedam happy kategorija i categoriesLists

        CategoriesList motivatedCategory = new CategoriesList("Motivated", R.drawable.motivated);
        categoriesLists.add(motivatedCategory); //pridedam motivated kategorija i categoriesLists


        //settinam adapteri i recyclerview
        categoriesRecyclerView.setAdapter(new CategoriesAdapter(categoriesLists, MainActivity.this));

    }
}