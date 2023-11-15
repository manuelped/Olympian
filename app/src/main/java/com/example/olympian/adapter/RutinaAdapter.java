package com.example.olympian.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olympian.R;
import com.example.olympian.model.Rutina;

import java.util.ArrayList;

public class RutinaAdapter extends RecyclerView.Adapter<RutinaAdapter.ViewHolderRutina> {

    ArrayList<Rutina> rutinaList;

    public RutinaAdapter(ArrayList<Rutina> rutinaList) {
        this.rutinaList = rutinaList;
    }

    @NonNull
    @Override
    public ViewHolderRutina onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rutina_single, parent, false);
        return new ViewHolderRutina(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderRutina holder, int position) {
        Rutina rutina = rutinaList.get(position);
        Log.d("zzzzzz", "onBindViewHolder: " + rutina);
        holder.nombre.setText(rutina.getNombre());
        holder.series.setText("series: " + String.valueOf(rutina.getSeries()));
        holder.repeticiones.setText("Repeticiones: " +String.valueOf(rutina.getRepeticiones()));
        holder.image.setImageResource(R.drawable.logo);
    }

    @Override
    public int getItemCount() {
        return rutinaList.size();
    }

    public static class ViewHolderRutina extends RecyclerView.ViewHolder {
        TextView nombre, series, repeticiones;
        ImageView image;

        public ViewHolderRutina(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre);
            series = itemView.findViewById(R.id.series);
            repeticiones = itemView.findViewById(R.id.repeticiones);
            image = itemView.findViewById(R.id.imgRutina);
        }
    }
}