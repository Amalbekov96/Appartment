package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.Dto.ImagesDto;
import kg.one.flat.Models.Images;
import kg.one.flat.Models.Mapper.ImagesMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImagesMapperImpl implements ImagesMapper {
    @Override
    public Images toEntity(ImagesDto imagesDto) {
        return ImagesMapper.INSTANCE.toEntity(imagesDto);
    }

    @Override
    public ImagesDto toDto(Images images) {
        return ImagesMapper.INSTANCE.toDto(images);
    }

    @Override
    public List<Images> toListEntity(List<ImagesDto> d) {
        return ImagesMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<ImagesDto> toListDto(List<Images> e) {
        return ImagesMapper.INSTANCE.toListDto(e);
    }
}
