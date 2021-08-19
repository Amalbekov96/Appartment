package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.Codes;
import kg.one.flat.Models.Dto.CodesDto;
import kg.one.flat.Models.Mapper.CodesMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CodesMapperImpl implements CodesMapper {
    @Override
    public Codes toEntity(CodesDto codesDto) {
        return CodesMapper.INSTANCE.toEntity(codesDto);
    }

    @Override
    public CodesDto toDto(Codes codes) {
        return CodesMapper.INSTANCE.toDto(codes);
    }

    @Override
    public List<Codes> toListEntity(List<CodesDto> d) {
        return CodesMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<CodesDto> toListDto(List<Codes> e) {
        return CodesMapper.INSTANCE.toListDto(e);
    }
}
