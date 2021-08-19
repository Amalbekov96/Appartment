package kg.one.flat.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Images extends BaseEntity{
    private String url;
    @ManyToOne
    private Flats flats;
}
