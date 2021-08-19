package kg.one.flat.Models;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Regions extends BaseEntity{
    private String name;
}
