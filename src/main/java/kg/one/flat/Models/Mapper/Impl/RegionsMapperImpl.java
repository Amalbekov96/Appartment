package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.Dto.RegionsDto;
import kg.one.flat.Models.Mapper.RegionsMapper;
import kg.one.flat.Models.Regions;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegionsMapperImpl implements RegionsMapper {
    @Override
    public Regions toEntity(RegionsDto regionsDto) {
        return RegionsMapper.INSTANCE.toEntity(regionsDto);
    }

    @Override
    public RegionsDto toDto(Regions regions) {
        return RegionsMapper.INSTANCE.toDto(regions);
    }

    @Override
    public List<Regions> toListEntity(List<RegionsDto> d) {
        return RegionsMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<RegionsDto> toListDto(List<Regions> e) {
        return RegionsMapper.INSTANCE.toListDto(e);
    }
}
