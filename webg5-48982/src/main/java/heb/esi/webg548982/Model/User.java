package heb.esi.webg548982.Model;

import lombok.Data;

import javax.persistence.*;

/**
 * Users
 */
@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    private int id;
    @Column(name="username")
    private String username;
    private String password;
    private boolean enabled;
}