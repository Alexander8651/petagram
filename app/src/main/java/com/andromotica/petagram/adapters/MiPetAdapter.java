package com.andromotica.petagram.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.andromotica.petagram.R;
import com.andromotica.petagram.pojo.Pet;

import java.util.ArrayList;

public class MiPetAdapter extends RecyclerView.Adapter<MiPetAdapter.MyPetViewHolder> {


    ArrayList<Pet> pets;

    public MiPetAdapter(ArrayList<Pet> pets){

        this.pets = pets;
    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    @NonNull
    @Override
    public MyPetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mipet, parent, false);
        return new MyPetViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull MiPetAdapter.MyPetViewHolder holder, int position) {
        final Pet pet = pets.get(position);
        holder.imgFotoProfile.setImageResource(R.drawable.betel);
    }

    public static class MyPetViewHolder extends  RecyclerView.ViewHolder{
        private ImageView imgFotoProfile;
        private TextView rating;
        private ImageView imgHuesoAmarrillo;

        public MyPetViewHolder(View itemView) {
            super(itemView);
            imgFotoProfile = (ImageView) itemView.findViewById(R.id.petImage);
            rating = (TextView) itemView.findViewById(R.id.petRaiting);
        }
    }
}
