package heb.esi.webg548982.Model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

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
}
