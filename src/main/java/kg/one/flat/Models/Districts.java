package kg.one.flat.Models;

import javax.persistence.ManyToOne;

public class Districts extends BaseEntity{
    private String name;
    @ManyToOne
    private Cities cities;
}
