package kg.one.flat.Models;

import kg.one.flat.Models.Enums.BookedHisotoryStatus;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

public class BookedHisotory extends BaseEntity{

    @ManyToOne
    private Flats flats;
    @ManyToOne
    private Users users;
    @ManyToOne
    private Admins admins;
    private BookedHisotoryStatus status;
    @CreationTimestamp
    private LocalDateTime addTime;
    @UpdateTimestamp
    private LocalDateTime editTime;
    private double totalPrice;
}
