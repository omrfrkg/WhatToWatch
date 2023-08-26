package com.omrfrkg.whattowhatch;

public class Singleton {

    private Movie sentMovie;
    private static Singleton singleton;

    private Singleton(){

    }
    public Movie getSentMovie(){
        return sentMovie;
    }
    public void setSentMovie(Movie sentMovie){
        this.sentMovie = sentMovie;
    }
    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }



}
