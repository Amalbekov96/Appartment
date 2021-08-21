package kg.one.flat.Models;

import kg.one.flat.Models.Enums.RequestStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
public class RequestsHistory extends BaseEntity{
    private RequestStatus status;
    @CreationTimestamp
    private LocalDateTime addDate;
    @ManyToOne
    private Codes Codes;
}
