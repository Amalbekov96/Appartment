package kg.one.flat.Models.Dto;

import kg.one.flat.Models.Users;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class BlackListDto extends BaseDto{
    private UsersDto user;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String reason;
}
