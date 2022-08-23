package heb.esi.layouts.dto;

import lombok.Value;

@Value
public class ProjectDto {

    String nom;
    Long nbSprints;
    boolean actif;
}
