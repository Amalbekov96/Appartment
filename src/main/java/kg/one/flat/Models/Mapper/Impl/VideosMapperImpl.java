package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.Dto.UsersDto;
import kg.one.flat.Models.Mapper.UsersMapper;
import kg.one.flat.Models.Users;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VideosMapperImpl implements UsersMapper {
    @Override
    public Users toEntity(UsersDto usersDto) {
        return UsersMapper.INSTANCE.toEntity(usersDto);
    }

    @Override
    public UsersDto toDto(Users users) {
        return UsersMapper.INSTANCE.toDto(users);
    }

    @Override
    public List<Users> toListEntity(List<UsersDto> d) {
        return UsersMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<UsersDto> toListDto(List<Users> e) {
        return UsersMapper.INSTANCE.toListDto(e);
    }
}
