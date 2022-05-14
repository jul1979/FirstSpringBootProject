package he2b.g48982.web5g.annualprogram.Model;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class Registration {

    @Id
    @SequenceGenerator(name="registration_generator", sequenceName = "hibernate_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "registration_generator")
    @Column(name = "id")

    private Integer number;
    private boolean mandatory;
    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;

    @ManyToOne
    @JoinColumn(name = "annual_program_id")
    private AnnualProgram annualProgram;


}
