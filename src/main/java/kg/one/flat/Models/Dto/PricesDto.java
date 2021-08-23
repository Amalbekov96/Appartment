package kg.one.flat.Models.Dto;

import kg.one.flat.Models.Flats;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class PricesDto extends BaseDto{

    private FlatsDto flat;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Double price;
}
