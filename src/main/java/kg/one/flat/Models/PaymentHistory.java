package kg.one.flat.Models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
public class PaymentHistory extends BaseEntity{
    @ManyToOne
    private BookedHisotory bookedHisotory;
    private double price;
    @CreationTimestamp
    private LocalDateTime addDate;
}
