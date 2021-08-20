package kg.one.flat.Models.Dto;

import kg.one.flat.Models.Cities;
import lombok.Data;

@Data
public class DistrictsDto extends BaseDto{
    private String name;
    private CitiesDto cities;
}
