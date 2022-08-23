package heb.esi.layouts.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder

public class InfoDto {

    String name;
    Long sprints;
    Long stories;

}
