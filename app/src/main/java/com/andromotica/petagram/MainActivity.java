package com.andromotica.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pet> pets;
    private RecyclerView listaPets;
    private Toolbar toolbar;
    private ImageView estrella;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbarmain);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("titulo toolbar");

        estrella = findViewById(R.id.estrella);

        estrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LikePetsActivity.class);
                startActivity(intent);
            }
        });




        listaPets = (RecyclerView) findViewById(R.id.listaPets);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaPets.setLayoutManager(llm);
        inicializarListaPets();
        inicializadorAdaptador();

    }

    public void inicializadorAdaptador(){
        PetagramAdapter adaptador = new PetagramAdapter(pets);
        listaPets.setAdapter(adaptador);
    }

    public void inicializarListaPets(){
        pets = new ArrayList<Pet>();
        pets.add(new Pet(R.drawable.betel, "Betel"));
        pets.add(new Pet(R.drawable.angel, "Angel"));
        pets.add(new Pet(R.drawable.cosiris, "Cosiris"));
        pets.add(new Pet(R.drawable.gucci, "Gucci"));
        pets.add(new Pet(R.drawable.canela, "Canela"));


    }
}