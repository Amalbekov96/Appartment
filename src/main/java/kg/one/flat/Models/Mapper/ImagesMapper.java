package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.Dto.ImagesDto;
import kg.one.flat.Models.Images;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import javax.persistence.ManyToOne;

@Mapper
public interface ImagesMapper extends BaseMapper<Images, ImagesDto> {
    ImagesMapper INSTANCE = Mappers.getMapper(ImagesMapper.class);
}
