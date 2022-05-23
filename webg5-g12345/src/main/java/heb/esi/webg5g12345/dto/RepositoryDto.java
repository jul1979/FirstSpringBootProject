package heb.esi.webg5g12345.dto;


import heb.esi.webg5g12345.model.Commit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RepositoryDto {

    private DepotDto depotDto;
    private List<Commit> commits;


}
