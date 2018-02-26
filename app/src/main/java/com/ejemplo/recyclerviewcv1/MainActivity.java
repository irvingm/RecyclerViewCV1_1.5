package com.ejemplo.recyclerviewcv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<DataProvider> productList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        productList.add(
                new DataProvider("Folklorica", "Movimiento Latino", "COMPRAR",R.drawable.folklore)
        );
        productList.add(
                new DataProvider("Rock Alternativo", "Urbano argentino", "",R.drawable.rock)
        );
        productList.add(
                new DataProvider("Acústicos", "Conciertos de trova", "",R.drawable.acustico)
        );
        productList.add(
                new DataProvider("Pop", "Más conciertos", "",R.drawable.pop)
        );

        adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);


    }
}
