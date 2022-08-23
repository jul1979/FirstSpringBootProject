package heb.esi.layouts.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class Project {

    @Id
    private String name;
    private boolean active;

    @OneToMany(mappedBy = "project",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonBackReference
    @ToString.Exclude
    private List<Sprint> sprints;
}
