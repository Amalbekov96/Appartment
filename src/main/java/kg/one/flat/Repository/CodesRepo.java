package kg.one.flat.Repository;

import kg.one.flat.Models.Codes;
import kg.one.flat.Models.Users;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CodesRepo extends BaseRepository<Codes>{
    Codes findByUsersAndEndDateIsAfter(Users user, LocalDateTime currentDate);
    List<Codes> findAllByUsersAndEndDateIsBefore(Users user, LocalDateTime currentDate);

    Codes findByCode(String code);
}
