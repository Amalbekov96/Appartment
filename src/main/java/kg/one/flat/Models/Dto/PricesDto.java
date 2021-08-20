package kg.one.flat.Models.Dto;

import kg.one.flat.Models.Flats;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PricesDto extends BaseDto{

    private FlatsDto flat;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double price;
}
