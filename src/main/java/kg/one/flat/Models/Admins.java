package kg.one.flat.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
public class Admins extends BaseEntity{
    private String name;
    private String username;
    private String password;
}
