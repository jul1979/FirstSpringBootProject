package g48982.webg5.pae.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
// @Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
// property = "matricule")
public class Student {

        @Id
        @GeneratedValue
        @NotNull(message = "Le matricule est obligatoire")
        private long matricule;

        @NotBlank(message = "Le nom est obligatoire")
        private String nom;
        @Convert(converter = GenreConverter.class)
        @NotNull(message = "Le genre est obligatoire")
        private Genre genre;

        @Convert(converter = SectionConverter.class)
        @NotNull(message = "La section est obligatoire")
        private Section section;

        @ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE,
                        CascadeType.PERSIST, CascadeType.REFRESH })

       /* @ManyToMany*/
        @JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "student_id"),
                   inverseJoinColumns = @JoinColumn(name = "course_id"))

        // @JsonManagedReference
        @JsonIgnore
        @ToString.Exclude
        private Set<Course> courseSet;



}
