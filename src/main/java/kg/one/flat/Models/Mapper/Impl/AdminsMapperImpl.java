package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.Admins;
import kg.one.flat.Models.Dto.AdminsDto;
import kg.one.flat.Models.Mapper.AdminsMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminsMapperImpl implements AdminsMapper {
    @Override
    public Admins toEntity(AdminsDto adminsDto) {
        return AdminsMapper.INSTANCE.toEntity(adminsDto);
    }

    @Override
    public AdminsDto toDto(Admins admins) {
        return AdminsMapper.INSTANCE.toDto(admins);
    }

    @Override
    public List<Admins> toListEntity(List<AdminsDto> d) {
        return AdminsMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<AdminsDto> toListDto(List<Admins> e) {
        return AdminsMapper.INSTANCE.toListDto(e);
    }
}
