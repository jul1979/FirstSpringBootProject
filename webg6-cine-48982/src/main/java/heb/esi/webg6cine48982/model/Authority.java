package heb.esi.webg6cine48982.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Authority {
 @Id
 private long id;
 private String name;
 private String authority;
 }