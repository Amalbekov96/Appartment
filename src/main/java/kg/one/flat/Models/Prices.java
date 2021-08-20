package kg.one.flat.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.one.flat.Models.BaseEntity;
import kg.one.flat.Models.Enums.RentType;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Data
public class Prices extends BaseEntity {
    @ManyToOne
    private Flats flat;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate startDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate endDate;
    private Double price;
}
