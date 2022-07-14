package heb.esi.webg6cine48982.business;

import com.google.common.collect.Lists;
import heb.esi.webg6cine48982.db.MovieRepository;
import heb.esi.webg6cine48982.dto.MovieDto;
import heb.esi.webg6cine48982.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public  MovieDto movieTitleandReviewAverage(Integer id) throws NoSuchElementException,IllegalArgumentException {
         if(id<0)throw new IllegalArgumentException("identifiant du film est négatif");
         Optional<Movie> optionalMovie = movieRepository.findById(id);
         if(optionalMovie.isEmpty()||optionalMovie.get().getReviews().isEmpty())throw new NoSuchElementException("pas de film connu sous cet identifiant");
        return movieRepository.movieTitleAndReviewAverage(id);
    }
    public List<Movie> getTitles(){
         Iterable<Movie> all = movieRepository.findAll();
         ArrayList<Movie> movies = Lists.newArrayList(all);
         return movies;
        // return Lists.newArrayList(movieRepository.findAll()).stream().map(Movie::getTitle)
                //.collect(Collectors.toList());
    }
    public Movie getMovieByTitle(String name){
      return   movieRepository.findByTitle(name);
    }

    public void update(Movie selectedMovie) {
        movieRepository.save(selectedMovie);
    }
}
