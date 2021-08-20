package kg.one.flat.Models.Dto;

import kg.one.flat.Models.Admins;
import kg.one.flat.Models.Enums.BookedHisotoryStatus;
import kg.one.flat.Models.Flats;
import kg.one.flat.Models.Users;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class BookedHistoryDto extends BaseDto{

    private FlatsDto flats;
    private UsersDto users;
    private AdminsDto admins;
    private BookedHisotoryStatus status;
    private LocalDateTime addTime;
    private LocalDateTime editTime;
    private double totalPrice;
}
