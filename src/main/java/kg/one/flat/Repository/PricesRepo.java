package kg.one.flat.Repository;

import kg.one.flat.Models.Dto.FlatsDto;
import kg.one.flat.Models.Flats;
import kg.one.flat.Models.Prices;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface PricesRepo extends BaseRepository<Prices>{
    Prices findByFlatAndEndDateIsNull(Flats flats);
}
