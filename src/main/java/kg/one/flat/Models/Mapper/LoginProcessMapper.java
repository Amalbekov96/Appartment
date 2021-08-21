package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.Dto.LoginProcessDto;
import kg.one.flat.Models.LoginProcess;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface LoginProcessMapper extends BaseMapper<LoginProcess, LoginProcessDto>{
    LoginProcessMapper INSTANCE = Mappers.getMapper(LoginProcessMapper.class);
}
