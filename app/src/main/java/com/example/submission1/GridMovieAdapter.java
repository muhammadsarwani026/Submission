package com.example.submission1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridMovieAdapter extends RecyclerView.Adapter<GridMovieAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<Movie> listMovie;
    private ArrayList<Movie> getListMovie() {
        return listMovie;
    }
    public void setListMovie(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }
    public GridMovieAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public GridMovieAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_movie, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridMovieAdapter.GridViewHolder gridViewHolder, int position) {
        Glide.with(context)
                .load(getListMovie().get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(gridViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListMovie().size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}