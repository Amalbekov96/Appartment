package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.Dto.UsersDto;
import kg.one.flat.Models.Dto.VideosDto;
import kg.one.flat.Models.Mapper.UsersMapper;
import kg.one.flat.Models.Mapper.VideosMapper;
import kg.one.flat.Models.Users;
import kg.one.flat.Models.Videos;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VideosMapperImpl implements VideosMapper {

    @Override
    public Videos toEntity(VideosDto videosDto) {
        return VideosMapper.INSTANCE.toEntity(videosDto);
    }

    @Override
    public VideosDto toDto(Videos videos) {
        return VideosMapper.INSTANCE.toDto(videos);
    }

    @Override
    public List<Videos> toListEntity(List<VideosDto> d) {
        return VideosMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<VideosDto> toListDto(List<Videos> e) {
        return VideosMapper.INSTANCE.toListDto(e);
    }
}
