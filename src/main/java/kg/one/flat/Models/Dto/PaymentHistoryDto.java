package kg.one.flat.Models.Dto;

import kg.one.flat.Models.BookedHisotory;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class PaymentHistoryDto extends BaseDto{

    private BookedHisotory bookedHisotory;
    private double price;
    private LocalDateTime addDate;
}
