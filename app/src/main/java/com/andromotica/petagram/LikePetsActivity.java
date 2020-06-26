package com.andromotica.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.andromotica.petagram.adapters.PetagramAdapter;
import com.andromotica.petagram.pojo.Pet;

import java.util.ArrayList;

public class LikePetsActivity extends AppCompatActivity {

    ArrayList<Pet> pets;
    private RecyclerView listaPets;
    Toolbar like;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like_pets);

        like = findViewById(R.id.toolbarlike);
        setSupportActionBar(like);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaPets = findViewById(R.id.likepetslist);
        listaPets.setLayoutManager(llm);

        inicializarListaLike();
        inicializaradaptador();

    }

    public void inicializaradaptador(){
        PetagramAdapter adapter = new PetagramAdapter(pets);
        listaPets.setAdapter(adapter);
    }

    public void inicializarListaLike(){
        pets = new ArrayList<Pet>();
        pets.add(new Pet(R.drawable.canela, "Canela"));
        pets.add(new Pet(R.drawable.angel, "Angel"));
        pets.add(new Pet(R.drawable.betel, "Betel"));
        pets.add(new Pet(R.drawable.cosiris, "Cosiris"));
        pets.add(new Pet(R.drawable.gucci, "Gucci"));

    }
}