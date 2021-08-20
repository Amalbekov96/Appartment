package kg.one.flat.Models.Dto;

import kg.one.flat.Models.Enums.CodeStatus;
import kg.one.flat.Models.Users;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class CodesDto extends BaseDto{
    private String code;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private CodeStatus status;
    private UsersDto users;
}
