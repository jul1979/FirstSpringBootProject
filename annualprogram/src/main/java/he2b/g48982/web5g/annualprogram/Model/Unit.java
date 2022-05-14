package he2b.g48982.web5g.annualprogram.Model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class Unit {

    @Id
    private String id;
    private String title;
    @NotNull
    @Min(value = 1 ,message = "cannot be lower than 1")
    @Max(value = 6,message = "cannot be lower than 6")
    private Integer semester;
    @NotNull
    @Positive
    private Integer ects;

    @ElementCollection(targetClass = Section.class)
    @CollectionTable(name = "Unit_Sections", joinColumns = @JoinColumn(name = "unit_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "sections")
    private Set<Section> sectionsSet;



}
