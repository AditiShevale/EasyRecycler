package com.example.aditi.easyrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aditi on 15/3/18.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    private List<Movie> mMovieList;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

//        Refers to CustomLayout i.e movieLayout

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movielayout,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//        Set Text
        Movie movie = mMovieList.get(position);

        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());

    }

    @Override
    public int getItemCount() {
        return mMovieList.size();
    }
    public  MovieAdapter(List<Movie> movieList){
        this.mMovieList = movieList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView title, genre, year;

        public MyViewHolder(View View) {
            super(View);
            title =(TextView) View.findViewById(R.id.MovieTitle);
            genre=(TextView) View.findViewById(R.id.Genre);
            year=(TextView) View.findViewById(R.id.Year);
        }
    }
}
