package kg.one.flat.Models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

public class PaymentHistory extends BaseEntity{
    @ManyToOne
    private BookedHisotory bookedHisotory;
    private double price;
    @CreationTimestamp
    private LocalDateTime addDate;
}
