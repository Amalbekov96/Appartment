package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.Districts;
import kg.one.flat.Models.Dto.DistrictsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface DistrictsMapper extends BaseMapper<Districts, DistrictsDto>{
    DistrictsMapper INSTANCE = Mappers.getMapper(DistrictsMapper.class);
}
