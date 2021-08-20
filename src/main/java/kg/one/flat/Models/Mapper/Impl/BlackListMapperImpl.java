package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.BlackList;
import kg.one.flat.Models.Dto.BlackListDto;
import kg.one.flat.Models.Mapper.BlackListMapper;

import java.util.List;

public class BlackListMapperImpl implements BlackListMapper {
    @Override
    public BlackList toEntity(BlackListDto blackListDto) {
        return BlackListMapper.INSTANCE.toEntity(blackListDto);
    }

    @Override
    public BlackListDto toDto(BlackList blackList) {
        return BlackListMapper.INSTANCE.toDto(blackList);
    }

    @Override
    public List<BlackList> toListEntity(List<BlackListDto> d) {
        return BlackListMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<BlackListDto> toListDto(List<BlackList> e) {
        return BlackListMapper.INSTANCE.toListDto(e);
    }
}
