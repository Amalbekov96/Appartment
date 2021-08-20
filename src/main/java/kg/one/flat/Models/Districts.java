package kg.one.flat.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
public class Districts extends BaseEntity{
    private String name;
    @ManyToOne
    private Cities cities;
}
