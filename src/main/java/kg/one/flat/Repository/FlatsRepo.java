package kg.one.flat.Repository;

import kg.one.flat.Models.Flats;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlatsRepo extends BaseRepository<Flats>{

}
