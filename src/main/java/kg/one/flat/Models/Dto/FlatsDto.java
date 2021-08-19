package kg.one.flat.Models.Dto;

import kg.one.flat.Models.Brokers;
import kg.one.flat.Models.Cities;
import kg.one.flat.Models.Districts;
import kg.one.flat.Models.Enums.FlatTypes;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class FlatsDto extends BaseDto{
    private int rooms;
    private int floor;
    private double area;
    private FlatTypes flatTypes;
    private Districts districts;
    private Cities cities;
    private LocalDateTime addDate;
    private LocalDateTime editDate;
    private String description;
    private double lat;
    private double lng;
    private Boolean wifi;
    private Boolean furniture;
    private Boolean image;
    private Boolean video;
    private Boolean broker;
    private Brokers brokers;
}
