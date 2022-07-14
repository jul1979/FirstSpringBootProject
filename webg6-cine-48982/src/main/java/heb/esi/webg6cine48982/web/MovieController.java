package heb.esi.webg6cine48982.web;

import heb.esi.webg6cine48982.business.CriticService;
import heb.esi.webg6cine48982.business.MovieService;
import heb.esi.webg6cine48982.business.ReviewService;
import heb.esi.webg6cine48982.model.Critic;
import heb.esi.webg6cine48982.model.Movie;
import heb.esi.webg6cine48982.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;
import java.util.Objects;

@Controller
public class MovieController {

    @Autowired
    private ReviewService reviewService;
    @Autowired
    private MovieService movieService;
    @Autowired
    private CriticService criticService;



    @GetMapping("/reviews")
    public String detail(Model model, Principal principal){
        model.addAttribute("principal", principal.getName());
        model.addAttribute("reviews",criticService.ReviewByCritic(principal.getName()));
        return "reviewsView";
    }

    @GetMapping("/movies/{critic}")
    public String movies(Model model, @PathVariable(name="critic") String critic){
        model.addAttribute("critics",reviewService.criticsReviewsByid(critic));
        return "reviewView";
    }
    @GetMapping("/addReviews")
    public String addAReview(Model model, Principal principal){
        model.addAttribute("principal", principal.getName());
        model.addAttribute("movies",movieService.getTitles());
        model.addAttribute("review",new Review());
        model.addAttribute("newMovie",new Movie());
        return "addReviews";
    }
    @PostMapping("/rateAmovie")
    public String rateAMovie(    @Valid @ModelAttribute(name = "review")Review review,
                                 @Valid @ModelAttribute(name="newMovie")Movie newMovie,
                                 Errors errors,
                                 Model model,Principal principal){
        model.addAttribute("principal", principal.getName());
         Critic currentCritic = criticService.findCriticByName(principal.getName());
         List<Review> reviews = currentCritic.getReviews();
         Movie selectedMovie = movieService.getMovieByTitle(newMovie.getTitle());

        for (Review r:reviews
             ) {
            if(Objects.equals(r.getMovie().getId(), selectedMovie.getId())||errors.hasErrors()){
                model.addAttribute("principal", principal.getName());
                model.addAttribute("movies",movieService.getTitles());
                model.addAttribute("message",true);
                return "addReviews";
            }
        }
        review.setMovie(selectedMovie);
        currentCritic.addReview(review);
        criticService.update(currentCritic);
        return detail(model,principal);
       // Webg6Cine48982Application.log.info(review.getRate().toString());
    }
}
