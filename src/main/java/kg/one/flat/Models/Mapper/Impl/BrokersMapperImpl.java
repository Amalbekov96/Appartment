package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.Brokers;
import kg.one.flat.Models.Dto.BrokersDto;
import kg.one.flat.Models.Mapper.BrokersMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrokersMapperImpl implements BrokersMapper {
    @Override
    public Brokers toEntity(BrokersDto brokersDto) {
        return BrokersMapper.INSTANCE.toEntity(brokersDto);
    }

    @Override
    public BrokersDto toDto(Brokers brokers) {
        return BrokersMapper.INSTANCE.toDto(brokers);
    }

    @Override
    public List<Brokers> toListEntity(List<BrokersDto> d) {
        return BrokersMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<BrokersDto> toListDto(List<Brokers> e) {
        return BrokersMapper.INSTANCE.toListDto(e);
    }
}
