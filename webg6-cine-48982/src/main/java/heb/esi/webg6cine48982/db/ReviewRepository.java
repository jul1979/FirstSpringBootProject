package heb.esi.webg6cine48982.db;

import heb.esi.webg6cine48982.model.Review;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepository extends CrudRepository<Review,Integer> {
    @Query("select r from Critic c left join c.reviews r where c.name=?1")
    List<Review> findByCritic(String name);
    List <Review> findReviewByCritic_Name(String name);
}
