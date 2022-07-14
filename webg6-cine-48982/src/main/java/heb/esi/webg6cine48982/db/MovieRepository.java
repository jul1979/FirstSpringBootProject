package heb.esi.webg6cine48982.db;

import heb.esi.webg6cine48982.dto.MovieDto;
import heb.esi.webg6cine48982.model.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Integer> {

  //@Query("select New heb.esi.webg6cine48982.dto.MovieDto(m.title,avg (r.rate))from Movie m left join m.reviews r group by m.id")
    @Query("select New heb.esi.webg6cine48982.dto.MovieDto(m.title,avg (r.rate))from Movie m left join m.reviews r where m.id=?1")
    MovieDto movieTitleAndReviewAverage(Integer id);
    Movie findByTitle(String title);
}
