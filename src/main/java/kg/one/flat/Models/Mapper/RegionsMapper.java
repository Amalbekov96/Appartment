package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.Dto.RegionsDto;
import kg.one.flat.Models.Regions;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface RegionsMapper extends BaseMapper<Regions, RegionsDto>{
    RegionsMapper INSTANCE = Mappers.getMapper(RegionsMapper.class);
}
