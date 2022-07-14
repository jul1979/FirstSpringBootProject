package heb.esi.webg6cine48982.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Critic {

    @Id
    private String name;
    private String password;
    private boolean enabled;

    @OneToMany(mappedBy="critic",cascade = CascadeType.ALL,fetch =FetchType.EAGER)
    @ToString.Exclude
    @JsonManagedReference
    private List<Review> reviews;

    public void addReview(Review review){
        reviews.add(review);
        review.setCritic(this);
    }
}
