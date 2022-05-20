package heb.esi.webg548982.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class StudentDto {

    private String name;
    private Long id;
    List<String> tasks;
}
