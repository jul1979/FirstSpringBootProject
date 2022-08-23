package heb.esi.layouts.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "story_seq")
    @SequenceGenerator(name="book_generator", sequenceName = "story_seq", allocationSize=100)
    private Integer id;
    private String title;
    @Positive(message = "always greater than zero")
    private Integer estimate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="sprint_id")
    @JsonBackReference
    @ToString.Exclude
    private Sprint sprint;
}
