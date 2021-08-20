package kg.one.flat.Models.Dto;

import kg.one.flat.Models.Regions;
import lombok.Data;

@Data
public class CitiesDto extends BaseDto{
    private String name;
    private RegionsDto regions;
}
