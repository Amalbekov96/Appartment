package kg.one.flat.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.one.flat.Models.BaseEntity;
import kg.one.flat.Models.Enums.RentType;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Prices extends BaseEntity {
    @ManyToOne
    private Flats flat;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Double price;
}
