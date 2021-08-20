package kg.one.flat.Service.Impl;

import kg.one.flat.Models.Dto.PricesDto;
import kg.one.flat.Models.Mapper.PricesMapper;
import kg.one.flat.Models.Prices;
import kg.one.flat.Repository.PricesRepo;
import org.springframework.stereotype.Service;

@Service
public class PricesServiceImpl extends BaseServiceImpl<Prices, PricesDto, PricesMapper, PricesRepo>{
    public PricesServiceImpl(PricesRepo repo, PricesMapper mapper) {
        super(repo, mapper);
    }
}
