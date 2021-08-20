package kg.one.flat.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
public class Regions extends BaseEntity{
    private String name;
}
