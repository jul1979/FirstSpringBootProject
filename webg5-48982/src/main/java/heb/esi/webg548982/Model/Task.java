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
public class Task {

    @Id
    private String id;
    @NotBlank(message = "La description est obligatoire")
    private String description;

}
