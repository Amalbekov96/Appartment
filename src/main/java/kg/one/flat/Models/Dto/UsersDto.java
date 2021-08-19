package kg.one.flat.Models.Dto;

import lombok.Data;

@Data
public class UsersDto extends BaseDto{
    private String name;
    private String phone;
    private String password;
}
