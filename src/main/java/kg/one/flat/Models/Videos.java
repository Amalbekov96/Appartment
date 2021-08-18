package kg.one.flat.Models;

import javax.persistence.ManyToOne;

public class Videos extends BaseEntity{
    private String url;
    @ManyToOne
    private Flats flats;
}
