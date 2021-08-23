package kg.one.flat.Models.Dto;

import kg.one.flat.Models.Enums.RequestStatus;
import kg.one.flat.Models.Users;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class RequestsHistoryDto extends BaseDto{
    private RequestStatus status;
    private LocalDateTime addDate;
    private CodesDto codesDto;
}
