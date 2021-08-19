package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.Cities;
import kg.one.flat.Models.Dto.CitiesDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface CitiesMapper extends BaseMapper<Cities, CitiesDto>{
    CitiesMapper INSTANCE = Mappers.getMapper(CitiesMapper.class);
}
