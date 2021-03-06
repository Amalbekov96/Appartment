package kg.one.flat.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
public class Cities extends BaseEntity {
    private String name;
    @ManyToOne
    private Regions regions;
}
