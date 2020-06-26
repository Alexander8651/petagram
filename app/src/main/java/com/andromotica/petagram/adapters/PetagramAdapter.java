package com.andromotica.petagram.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.andromotica.petagram.pojo.Pet;
import com.andromotica.petagram.R;

import java.util.ArrayList;

public class PetagramAdapter extends RecyclerView.Adapter<PetagramAdapter.PetViewHolder> {

    ArrayList<Pet> pets;
    public PetagramAdapter(ArrayList<Pet> pets){
        this.pets = pets;
    }
    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new PetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PetViewHolder holder, int position) {
        final Pet pet = pets.get(position);
        holder.imgFoto.setImageResource(pet.getFoto());
        holder.petName.setText(pet.getNombre());

    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    public static class PetViewHolder extends  RecyclerView.ViewHolder{
         private ImageView imgFoto;
         private ImageView imghueso;
         private TextView petName;
         private TextView rating;
         private ImageView imgHuesoAmarrillo;

        public PetViewHolder( View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.petImage);
            imghueso = (ImageView) itemView.findViewById(R.id.hueso);
            petName = (TextView) itemView.findViewById(R.id.petName);
            rating = (TextView) itemView.findViewById(R.id.petRaiting);
        }
    }

}
