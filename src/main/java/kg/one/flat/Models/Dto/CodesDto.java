package kg.one.flat.Models.Dto;

import kg.one.flat.Models.Enums.CodeStatus;
import kg.one.flat.Models.Users;
import lombok.Data;

import java.time.LocalDate;
@Data
public class CodesDto extends BaseDto{
    private String code;
    private LocalDate startDate;
    private LocalDate endDate;
    private CodeStatus status;
    private Users users;
}
