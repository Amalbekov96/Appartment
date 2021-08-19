package kg.one.flat.Models;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Brokers extends BaseEntity{
    private String name;
}
