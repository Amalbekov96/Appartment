package kg.one.flat.Models;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Users extends BaseEntity {
    private String name;
    private String phone;
    private String password;
}
