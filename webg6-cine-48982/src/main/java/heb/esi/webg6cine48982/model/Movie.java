package heb.esi.webg6cine48982.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie {

    @Id
    @SequenceGenerator(name="movie_id_seq", sequenceName = "MOVIE_ID_SEQ", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_id_seq")
    private Integer id;
    @NotBlank(message = "le titre ne peut etre vide")
    private String title;

    @OneToMany(mappedBy="movie",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @ToString.Exclude
    //@JsonManagedReference
    private List<Review> reviews;

    public void addReview(Review review){
        reviews.add(review);
        review.setMovie(this);
    }




}
