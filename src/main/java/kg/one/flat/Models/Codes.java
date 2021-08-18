package kg.one.flat.Models;

import kg.one.flat.Models.Enums.CodeStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Data
public class Codes extends BaseEntity{
    private String code;
    @CreationTimestamp
    private LocalDate startDate;
    private LocalDate endDate;
    private CodeStatus status;
    @ManyToOne
    private Users users;
}
