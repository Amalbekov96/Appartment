package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.Districts;
import kg.one.flat.Models.Dto.DistrictsDto;
import kg.one.flat.Models.Mapper.DistrictsMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DistrictsMapperImpl implements DistrictsMapper {
    @Override
    public Districts toEntity(DistrictsDto districtsDto) {
        return DistrictsMapper.INSTANCE.toEntity(districtsDto);
    }

    @Override
    public DistrictsDto toDto(Districts districts) {
        return DistrictsMapper.INSTANCE.toDto(districts);
    }

    @Override
    public List<Districts> toListEntity(List<DistrictsDto> d) {
        return DistrictsMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<DistrictsDto> toListDto(List<Districts> e) {
        return DistrictsMapper.INSTANCE.toListDto(e);
    }
}
