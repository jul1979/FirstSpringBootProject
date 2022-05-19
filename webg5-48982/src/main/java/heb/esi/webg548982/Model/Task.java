package heb.esi.webg548982.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task {

    @Id
    private String id;
    @NotBlank(message = "La description est obligatoire")
    private String description;

    @ManyToMany(mappedBy = "tasks")
    @JsonIgnore
    @ToString.Exclude
    private List<Student> students;



}
