package g48982.webg5.pae.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.Set;


/*
@NamedNativeQuery(name = "Student_Course.findStudentPojoById_Named",
        query = "SELECT student.matricule, student.nom, student.genre, student.section FROM STUDENT_COURSE join student on student.matricule" +
                " =STUDENT_COURSE .student_id where STUDENT_COURSE.course_id=:sigle",
        resultSetMapping = "Mapping.StudentPojo")

@SqlResultSetMapping( name ="Mapping.StudentPojo",
        classes = @ConstructorResult(targetClass = StudentPojo.class, columns =
                {
                        @ColumnResult(name="matricule"),
                        @ColumnResult(name="nom"),
                        @ColumnResult(name="genre"),
                        @ColumnResult(name="section")
                }))


*/

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
// property = "id")


public class Course {

  @Id
  @NotBlank(message = "Le sigle est obligatoire")
  private String id;

  @NotBlank(message = " Le titre est obligatoire.")
  private String title;

  @Positive(message = "le nombre de credits doit etre positif")
  private int credits;

  @ManyToMany(mappedBy = "courseSet")
  @JsonIgnore
  @ToString.Exclude
  private Set<Student> studentSet;
}
