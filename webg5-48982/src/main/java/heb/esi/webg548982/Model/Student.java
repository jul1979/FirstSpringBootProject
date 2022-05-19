package heb.esi.webg548982.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class Student {

    @Id
    private Long number;

    @NotBlank(message = "Le nom est obligatoire")
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    @ToString.Exclude
    @JoinTable(name = "student_task", joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "task_id")})
    private List<Task> tasks;
}
