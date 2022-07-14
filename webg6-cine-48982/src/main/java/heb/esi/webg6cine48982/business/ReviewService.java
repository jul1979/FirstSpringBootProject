package heb.esi.webg6cine48982.business;

import heb.esi.webg6cine48982.db.ReviewRepository;
import heb.esi.webg6cine48982.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository repository;
    public List<Review> criticsReviewsByid (String id)throws IllegalArgumentException{
        return repository.findByCritic(id);
    }
   public List<Review>reviewsByCriticName(String name){
        return repository.findReviewByCritic_Name(name);
    }

}
