package kg.one.flat.Models.Dto;

import kg.one.flat.Models.Enums.BookedHisotoryStatus;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class BookedHistoryDto extends BaseDto{

    private FlatsDto flats;
    private UsersDto users;
    private BookedHisotoryStatus status;
    private LocalDateTime addTime;
    private LocalDateTime editTime;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private double totalPrice;
}
