package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.Dto.FlatsDto;
import kg.one.flat.Models.Flats;
import kg.one.flat.Models.Mapper.FlatsMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlatsMapperImpl implements FlatsMapper {
    @Override
    public Flats toEntity(FlatsDto flatsDto) {
        return FlatsMapper.INSTANCE.toEntity(flatsDto);
    }

    @Override
    public FlatsDto toDto(Flats flats) {
        return FlatsMapper.INSTANCE.toDto(flats);
    }

    @Override
    public List<Flats> toListEntity(List<FlatsDto> d) {
        return FlatsMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<FlatsDto> toListDto(List<Flats> e) {
        return FlatsMapper.INSTANCE.toListDto(e);
    }
}
