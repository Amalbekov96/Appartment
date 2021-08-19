package kg.one.flat.Models.Dto;

import lombok.Data;

@Data
public class AdminsDto extends BaseDto{
    private String name;
    private String username;
    private String password;
}
