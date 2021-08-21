package kg.one.flat.Models.Dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LoginProcessDto extends BaseDto{

    private UsersDto user;
    private int count;
    private String reason;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
