package kg.one.flat.Models;

import kg.one.flat.Models.Enums.BookedHisotoryStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
public class BookedHisotory extends BaseEntity{

    @ManyToOne
    private Flats flats;
    @ManyToOne
    private Users users;
    private BookedHisotoryStatus status;
    @CreationTimestamp
    private LocalDateTime addTime;
    @UpdateTimestamp
    private LocalDateTime editTime;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private double totalPrice;
}
