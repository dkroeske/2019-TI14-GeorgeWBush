package com.appsfromholland.georgebush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<GeorgeBush> dataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Init dataset
        this.dataset = GeorgeBushImageFactory.getInstance().getDataset();

        recyclerView = findViewById(R.id.gwbRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new GWBAdapter(dataset);
        recyclerView.setAdapter(adapter);

    }
}
