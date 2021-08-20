package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.Dto.PricesDto;
import kg.one.flat.Models.Mapper.PricesMapper;
import kg.one.flat.Models.Prices;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PricesMapperImpl implements PricesMapper {
    @Override
    public Prices toEntity(PricesDto pricesDto) {
        return PricesMapper.INSTANCE.toEntity(pricesDto);
    }

    @Override
    public PricesDto toDto(Prices prices) {
        return PricesMapper.INSTANCE.toDto(prices);
    }

    @Override
    public List<Prices> toListEntity(List<PricesDto> d) {
        return PricesMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<PricesDto> toListDto(List<Prices> e) {
        return PricesMapper.INSTANCE.toListDto(e);
    }
}
