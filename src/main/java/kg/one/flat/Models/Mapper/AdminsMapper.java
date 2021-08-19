package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.Admins;
import kg.one.flat.Models.Dto.AdminsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AdminsMapper extends BaseMapper<Admins, AdminsDto> {
    AdminsMapper INSTANCE = Mappers.getMapper(AdminsMapper.class);
}
