package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.Dto.FlatsDto;
import kg.one.flat.Models.Flats;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface FlatsMapper extends BaseMapper<Flats, FlatsDto>{
    FlatsMapper INSTANCE = Mappers.getMapper(FlatsMapper.class);
}
