package kg.one.flat.Models;

import kg.one.flat.Models.Enums.FlatTypes;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@Entity
public class Flats extends BaseEntity {
    private int rooms;
    private int floor;
    private double area;
    private FlatTypes flatTypes;
    @ManyToOne
    private Districts districts;
    @ManyToOne
    private Cities cities;
    @CreationTimestamp
    private LocalDateTime addDate;
    @UpdateTimestamp
    private LocalDateTime editDate;
    private String description;
    private double lat;
    private double lng;
    private Boolean wifi;
    private Boolean furniture;
    private Boolean image;
    private Boolean video;
    private Boolean broker;
    @ManyToOne
    private Brokers brokers;
}
