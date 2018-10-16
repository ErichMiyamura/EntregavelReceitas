package com.example.user.entregavelreceitas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.user.entregavelreceitas.entregavel.Model.Receitas;
import com.example.user.entregavelreceitas.entregavel.adapter.ReceitasAdapter;

import java.util.ArrayList;

public class ReceitaApp extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<Receitas> ReceitaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.item_receita);

        ReceitaList = new ArrayList<>();
        ReceitaList.add(new Receitas(R.drawable.japanese_food,"Japanese Food", "Combo Sushi"));
        ReceitaList.add(new Receitas(R.drawable.brazilian_food,"Brazilian Food", "Arroz, Feijão e Frango"));
        ReceitaList.add(new Receitas(R.drawable.japanese_food,"Japanese Food", "Combo Sushi"));
        ReceitaList.add(new Receitas(R.drawable.brazilian_food,"Brazilian Food", "Arroz, Feijão e Frango"));
        ReceitaList.add(new Receitas(R.drawable.japanese_food,"Japanese Food", "Combo Sushi"));
        ReceitaList.add(new Receitas(R.drawable.brazilian_food,"Brazilian Food", "Arroz, Feijão e Frango"));
        ReceitaList.add(new Receitas(R.drawable.japanese_food,"Japanese Food", "Combo Sushi"));
        ReceitaList.add(new Receitas(R.drawable.brazilian_food,"Brazilian Food", "Arroz, Feijão e Frango"));


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager itemReceitaLayoutManager = layoutManager;

        recyclerView.setLayoutManager(itemReceitaLayoutManager);

        ReceitasAdapter adapter = new ReceitasAdapter(this, ReceitaList);

        recyclerView.setAdapter(adapter);
    }
}
