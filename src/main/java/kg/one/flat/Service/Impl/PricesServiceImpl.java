package kg.one.flat.Service.Impl;

import kg.one.flat.Models.Dto.FlatsDto;
import kg.one.flat.Models.Dto.PricesDto;
import kg.one.flat.Models.Flats;
import kg.one.flat.Models.Mapper.FlatsMapper;
import kg.one.flat.Models.Mapper.PricesMapper;
import kg.one.flat.Models.Prices;
import kg.one.flat.Repository.PricesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PricesServiceImpl extends BaseServiceImpl<Prices, PricesDto, PricesMapper, PricesRepo>{
    public PricesServiceImpl(PricesRepo repo, PricesMapper mapper) {
        super(repo, mapper);
    }

    @Autowired
    private PricesMapper pricesMapper;
    @Autowired
    private PricesRepo pricesRepo;
    @Autowired
    private FlatsMapper flatsMapper;

    @Override
    public ResponseEntity<?> create(PricesDto pricesDto) {

        PricesDto oldPrice = pricesMapper.toDto(pricesRepo.findByEndDateIsNull());

        if(oldPrice == null){
            return super.create(pricesDto);
        } else {
            oldPrice.setEndDate(LocalDateTime.now());
            pricesDto.setEndDate(null);
            pricesRepo.save(pricesMapper.toEntity(oldPrice));
            return super.create(pricesDto);
        }
    }

    PricesDto findByFlat(FlatsDto flatsDto){
        return pricesMapper.toDto(pricesRepo.findByFlatAndEndDateIsNull(flatsMapper.toEntity(flatsDto)));
    }
}
