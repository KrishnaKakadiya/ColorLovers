package com.krishna.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.krishna.myapplication.R;
import com.krishna.myapplication.databinding.GirdViewItemsBinding;
import com.krishna.myapplication.models.ColourLovers;

import java.util.List;

public class ColourLoverAdapter extends RecyclerView.Adapter<ColourLoverAdapter.ColourLoverViewHolder> {

    List<ColourLovers> colourLoversList;

    public ColourLoverAdapter(List<ColourLovers> colourLoversList) {
        this.colourLoversList = colourLoversList;
    }

    @NonNull
    @Override
    public ColourLoverViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        GirdViewItemsBinding girdViewItemsBinding = GirdViewItemsBinding.inflate(layoutInflater, parent, false);
        return new ColourLoverViewHolder(girdViewItemsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ColourLoverViewHolder holder, int position) {
        final ColourLovers colourLovers = colourLoversList.get(position);
        holder.girdViewItemsBinding.setColourLovers(colourLovers);
        holder.girdViewItemsBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return colourLoversList.size();
    }

    class ColourLoverViewHolder extends RecyclerView.ViewHolder {

        GirdViewItemsBinding girdViewItemsBinding;

        public ColourLoverViewHolder(@NonNull GirdViewItemsBinding girdViewItemsBinding) {
            super(girdViewItemsBinding.getRoot());
            this.girdViewItemsBinding = girdViewItemsBinding;

            girdViewItemsBinding.favoriteImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    girdViewItemsBinding.favoriteImage.setBackgroundResource(R.drawable.filled_heart);
                }
            });
        }
    }
}