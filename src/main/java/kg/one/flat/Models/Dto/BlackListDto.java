package kg.one.flat.Models.Dto;

import kg.one.flat.Models.Users;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class BlackListDto extends BaseDto{
    private Users user;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
