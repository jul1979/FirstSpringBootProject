package heb.esi.webg6cine48982.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Review {

    @Id
    @SequenceGenerator(name="review_id_seq", sequenceName = "REVIEW_ID_SEQ", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "review_id_seq")
    private Integer id;
    @Positive(message = "rate should be positive number")
    private Integer rate;

    @ManyToOne(fetch =FetchType.LAZY )
    @ToString.Exclude
    @JsonBackReference
    @JoinColumn(name = "critic_name")
    private Critic critic;

    @ManyToOne
    @JsonBackReference
    @ToString.Exclude
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return id.equals(review.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
