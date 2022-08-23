package heb.esi.layouts.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sprint {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sprint_seq")
    @SequenceGenerator(name="book_generator", sequenceName = "sprint_seq", allocationSize=100)
    private Integer id;
    @Positive(message = "always greater than zero")
    private Integer number;
    @Positive(message = "always greater than zero")
    private Integer days;
    @OneToMany(mappedBy = "sprint",cascade = CascadeType.ALL)
    @JsonManagedReference
    @ToString.Exclude
    private List<Story> stories;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="project_name")
    @JsonManagedReference
    @ToString.Exclude
    private Project project;


}
