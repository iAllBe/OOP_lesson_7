package services;

import models.Movie;

public interface IFilmService {
    Movie getMove(String movieName);
    void addMovie(Movie movie);
    void editMovie(Movie movie);
    void deleteMovie(Movie movie);    
}
