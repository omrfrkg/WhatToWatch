package com.omrfrkg.whattowhatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.omrfrkg.whattowhatch.databinding.ActivityMovieDetailsBinding;

public class MovieDetailsActivity extends AppCompatActivity {

    private ActivityMovieDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMovieDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Singleton singleton = Singleton.getInstance();
        Movie movie = singleton.getSentMovie();

        binding.imageMovie.setImageResource(movie.moviePic);
        binding.textDirector.setText("Yönetmen : "+movie.director);
        binding.textIMDbRating.setText("IMDb Puanı :"+Double.toString(movie.imdbRating));
        binding.textMovieGenre.setText("Tür : "+movie.movieGenre);
        binding.textMovieName.setText("Film Adı : "+movie.movieName);
        binding.textMovieDescription.setText("Konusu : "+movie.movieDescription);
        binding.textReleaseDate.setText("Vizyon Tarihi : "+Integer.toString(movie.releaseDate));
        binding.textStars.setText("Başroller : "+movie.stars);



    }
}