package heb.esi.webg5g12345.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Commit {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "commit_generator")
    @SequenceGenerator(name="commit_generator", sequenceName = "commit_seq", allocationSize=1)
    private Integer id;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate date;
    @NotBlank(message = "message is mandatory")
    private String message;

    @ManyToOne
    @JoinColumn(name = "repository_id")
    @JsonBackReference
    @ToString.Exclude
    private  Repository repository;

}
