package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.BlackList;
import kg.one.flat.Models.Dto.BlackListDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface BlackListMapper extends BaseMapper<BlackList, BlackListDto>{
    BlackListMapper INSTANCE = Mappers.getMapper(BlackListMapper.class);
}
