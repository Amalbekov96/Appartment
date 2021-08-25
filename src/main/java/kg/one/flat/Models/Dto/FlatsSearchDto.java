package kg.one.flat.Models.Dto;

import kg.one.flat.Models.Enums.FlatTypes;
import kg.one.flat.Models.Enums.RentType;
import lombok.Data;

@Data
public class FlatsSearchDto {
    private int rooms;
    private int floor;
    private double area;
    private FlatTypes flatTypes;
    private DistrictsDto districts;
    private CitiesDto cities;
    private Boolean wifi;
    private Boolean furniture;
    private Boolean image;
    private Boolean video;
    private Boolean broker;
    private int appartmentFloor;
    private RentType type;
}
