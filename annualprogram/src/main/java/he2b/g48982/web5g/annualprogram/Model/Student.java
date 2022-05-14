package he2b.g48982.web5g.annualprogram.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_generator")
    @SequenceGenerator(name="student_generator", sequenceName = "student_seq", allocationSize=1)
    private Integer number;
    private String name;
    @NotNull
    @Min(value = 1 ,message = "cannot be lower than 1")
    @Max(value = 3,message = "cannot be lower than 3")
    private Integer bloc;
    private Section section;





}
