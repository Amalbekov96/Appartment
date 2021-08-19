package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.Cities;
import kg.one.flat.Models.Dto.CitiesDto;
import kg.one.flat.Models.Mapper.CitiesMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CitiesMapperImpl implements CitiesMapper {
    @Override
    public Cities toEntity(CitiesDto citiesDto) {
        return CitiesMapper.INSTANCE.toEntity(citiesDto);
    }

    @Override
    public CitiesDto toDto(Cities cities) {
        return CitiesMapper.INSTANCE.toDto(cities);
    }

    @Override
    public List<Cities> toListEntity(List<CitiesDto> d) {
        return CitiesMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<CitiesDto> toListDto(List<Cities> e) {
        return CitiesMapper.INSTANCE.toListDto(e);
    }
}
