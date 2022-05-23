package heb.esi.webg5g12345.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Subscriber {

    @Id
    private String login;

    private String name;

    @OneToMany(mappedBy = "subscriber")
    @ToString.Exclude
    @JsonManagedReference
    private List<Repository> repositories;

}
