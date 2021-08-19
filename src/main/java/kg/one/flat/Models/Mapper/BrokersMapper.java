package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.Brokers;
import kg.one.flat.Models.Dto.BrokersDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface BrokersMapper extends BaseMapper<Brokers, BrokersDto>{
    BrokersMapper INSTANCE = Mappers.getMapper(BrokersMapper.class);
}
