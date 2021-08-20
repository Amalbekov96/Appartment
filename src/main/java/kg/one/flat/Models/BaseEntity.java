package kg.one.flat.Models;

import lombok.Data;

import javax.persistence.*;
@Data
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
