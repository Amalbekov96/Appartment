package kg.one.flat.Models.Dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UsersDto extends BaseDto{
    private String phone;
    private LocalDateTime blockedDate;
    private Boolean isBroker;
}
