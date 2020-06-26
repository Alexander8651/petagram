package com.andromotica.petagram.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andromotica.petagram.R;
import com.andromotica.petagram.adapters.PetagramAdapter;
import com.andromotica.petagram.pojo.Pet;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    ArrayList<Pet> pets;
    private RecyclerView listaPets;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_home, container, false);

        listaPets = (RecyclerView) v.findViewById(R.id.listaPets);

        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaPets.setLayoutManager(llm);

        inicializarListaPets();
        inicializadorAdaptador();
        return v;
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