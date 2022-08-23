package heb.esi.layouts.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person {


    @Id
   @GeneratedValue
    private Integer id;
    @NotBlank(message = "firstname cannot be null")
    private String firstname;

    @NotBlank(message = "lastname cannot be null")
    private String lastName;
    private String country;
    private String sexe;
}
