package heb.esi.webg6cine48982.web;


import heb.esi.webg6cine48982.business.MovieService;
import heb.esi.webg6cine48982.business.ReviewService;
import heb.esi.webg6cine48982.dto.MovieDto;
import heb.esi.webg6cine48982.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class MovieRestController {

    @Autowired
    private MovieService movieService;
    @Autowired
    private ReviewService reviewService;

    @GetMapping(value = "/movies/{id}")
    public @ResponseBody
    ResponseEntity<?> criticAverage(@PathVariable(name = "id") Integer id) {
        try {
            MovieDto movieDto = movieService.movieTitleandReviewAverage(id);
            return new ResponseEntity<>(movieDto, HttpStatus.OK);
        } catch (NoSuchElementException ex) {
            return new ResponseEntity<>("no movie found or no rating for that movie yet " + id, HttpStatus.NOT_FOUND);
        } catch (IllegalArgumentException iae) {
            return new ResponseEntity<>("film id is negative,has to be positive", HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    //for testing purposes
    @GetMapping("/reviews/{name}")
    public ResponseEntity<List<Review>> allStudents(@PathVariable(name = "name") String name) {
        return new ResponseEntity<>(reviewService.reviewsByCriticName(name), HttpStatus.OK);
    }


}
