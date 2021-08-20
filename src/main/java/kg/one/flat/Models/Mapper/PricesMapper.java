package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.Dto.PricesDto;
import kg.one.flat.Models.Prices;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface PricesMapper extends BaseMapper<Prices, PricesDto>{
    PricesMapper INSTANCE = Mappers.getMapper(PricesMapper.class);
}
