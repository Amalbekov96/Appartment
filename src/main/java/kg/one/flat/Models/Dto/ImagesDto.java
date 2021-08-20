package kg.one.flat.Models.Dto;

import kg.one.flat.Models.Flats;
import lombok.Data;

@Data
public class ImagesDto extends BaseDto{
    private String url;
    private FlatsDto flats;
}
