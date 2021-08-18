package kg.one.flat.Models;

import javax.persistence.ManyToOne;

public class Cities extends BaseEntity {
    private String name;
    @ManyToOne
    private Regions regions;
}
