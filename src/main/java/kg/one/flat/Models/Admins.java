package kg.one.flat.Models;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Admins extends BaseEntity{
    private String name;
    private String username;
    private String password;
}
