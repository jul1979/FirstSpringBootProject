package he2b.g48982.web5g.annualprogram.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDto {

    private String id;
    private String title;
    private Integer ECTS;
    private Integer semester;
    private boolean mandatory;

}
