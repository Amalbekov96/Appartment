package kg.one.flat.Models;

import kg.one.flat.Models.Enums.RequestStatus;

import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

public class RequestsHistory extends BaseEntity{
    private RequestStatus status;
    private LocalDateTime addDate;
    @ManyToOne
    private Users users;
}
