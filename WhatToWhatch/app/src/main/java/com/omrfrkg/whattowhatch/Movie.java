package com.omrfrkg.whattowhatch;

public class Movie {

    String movieName;
    String movieGenre;
    String director;
    String stars;
    int releaseDate;
    double imdbRating;
    String movieDescription;
    int moviePic;


    public Movie(String movieName, String movieGenre, String director, String stars, int releaseDate, double imdbRating, String movieDescription, int moviePic) {
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.director = director;
        this.stars = stars;
        this.releaseDate = releaseDate;
        this.imdbRating = imdbRating;
        this.movieDescription = movieDescription;
        this.moviePic = moviePic;
    }
}
