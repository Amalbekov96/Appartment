package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.Codes;
import kg.one.flat.Models.Dto.CodesDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface CodesMapper extends BaseMapper<Codes, CodesDto>{
    CodesMapper INSTANCE = Mappers.getMapper(CodesMapper.class);
}
