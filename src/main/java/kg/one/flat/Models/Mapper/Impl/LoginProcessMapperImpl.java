package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.Dto.LoginProcessDto;
import kg.one.flat.Models.LoginProcess;
import kg.one.flat.Models.Mapper.LoginProcessMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoginProcessMapperImpl implements LoginProcessMapper {
    @Override
    public LoginProcess toEntity(LoginProcessDto loginProcessDto) {
        return LoginProcessMapper.INSTANCE.toEntity(loginProcessDto);
    }

    @Override
    public LoginProcessDto toDto(LoginProcess loginProcess) {
        return LoginProcessMapper.INSTANCE.toDto(loginProcess);
    }

    @Override
    public List<LoginProcess> toListEntity(List<LoginProcessDto> d) {
        return LoginProcessMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<LoginProcessDto> toListDto(List<LoginProcess> e) {
        return LoginProcessMapper.INSTANCE.toListDto(e);
    }
}
