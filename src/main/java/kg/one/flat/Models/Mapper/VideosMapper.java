package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.Dto.VideosDto;
import kg.one.flat.Models.Videos;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface VideosMapper extends BaseMapper<Videos, VideosDto>{
    VideosMapper INSTANCE = Mappers.getMapper(VideosMapper.class);
}
