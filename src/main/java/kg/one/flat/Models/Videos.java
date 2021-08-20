package kg.one.flat.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
public class Videos extends BaseEntity{
    private String url;
    @ManyToOne
    private Flats flats;
}
