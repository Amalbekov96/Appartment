package kg.one.flat.Models;

import javax.persistence.ManyToOne;

public class Images extends BaseEntity{
    private String url;
    @ManyToOne
    private Flats flats;
}
