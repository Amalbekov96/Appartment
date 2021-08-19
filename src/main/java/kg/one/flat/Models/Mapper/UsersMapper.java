package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.Dto.UsersDto;
import kg.one.flat.Models.Users;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface UsersMapper extends BaseMapper<Users, UsersDto>{
    UsersMapper INSTANCE = Mappers.getMapper(UsersMapper.class);
}
