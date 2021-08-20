package kg.one.flat.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.one.flat.Models.Enums.CodeStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Codes extends BaseEntity{
    private String code;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private CodeStatus status;
    @ManyToOne
    private Users users;
}
