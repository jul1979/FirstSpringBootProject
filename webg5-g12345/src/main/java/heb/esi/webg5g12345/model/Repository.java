package heb.esi.webg5g12345.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class Repository {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "repo_generator")
    @SequenceGenerator(name="repo_generator", sequenceName = "repo_seq", allocationSize=1)
    private  Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    @JsonBackReference
    @ToString.Exclude
    private Subscriber subscriber;

    @OneToMany(mappedBy="repository",fetch = FetchType.EAGER, cascade={CascadeType.PERSIST,
            CascadeType.REMOVE})
    @ToString.Exclude
    @JsonManagedReference
    private List<Commit> commits;
}
