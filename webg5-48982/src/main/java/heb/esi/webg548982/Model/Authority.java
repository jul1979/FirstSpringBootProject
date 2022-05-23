package heb.esi.webg548982.Model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Authorities
 */
@Entity
@Data
public class Authority {
    @Id
    private long id;
    @Column(name="username")
    private String username;
    private String authority;
}
