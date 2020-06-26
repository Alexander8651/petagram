package com.andromotica.petagram.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andromotica.petagram.R;
import com.andromotica.petagram.adapters.MiPetAdapter;
import com.andromotica.petagram.adapters.PetagramAdapter;
import com.andromotica.petagram.pojo.Pet;

import java.util.ArrayList;

public class PetFragment extends Fragment {

    private RecyclerView recycler;
    ArrayList<Pet> pets;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pet, container, false);

        recycler = (RecyclerView) v.findViewById(R.id.rcMimascota);

        GridLayoutManager glm = new GridLayoutManager(getContext(), 3);
        recycler.setLayoutManager(glm);

        iniciarMiPet();
        iniciarAdaptador();

        return v;
    }

    private void iniciarMiPet(){
        pets = new ArrayList<Pet>();
        pets.add(new Pet(R.drawable.betel, "Betel"));
        pets.add(new Pet(R.drawable.betel, "Betel"));
        pets.add(new Pet(R.drawable.betel, "Betel"));
        pets.add(new Pet(R.drawable.betel, "Betel"));
        pets.add(new Pet(R.drawable.betel, "Betel"));
        pets.add(new Pet(R.drawable.betel, "Betel"));
        pets.add(new Pet(R.drawable.betel, "Betel"));
        pets.add(new Pet(R.drawable.betel, "Betel"));
        pets.add(new Pet(R.drawable.betel, "Betel"));
        pets.add(new Pet(R.drawable.betel, "Betel"));
        pets.add(new Pet(R.drawable.betel, "Betel"));
        pets.add(new Pet(R.drawable.betel, "Betel"));
        pets.add(new Pet(R.drawable.betel, "Betel"));
    }

    private void iniciarAdaptador(){
        MiPetAdapter adapter = new MiPetAdapter(pets);
        recycler.setAdapter(adapter);

    }
}