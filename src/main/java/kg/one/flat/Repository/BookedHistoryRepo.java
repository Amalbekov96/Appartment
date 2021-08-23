package kg.one.flat.Repository;

import kg.one.flat.Models.BookedHisotory;
import kg.one.flat.Models.Dto.BookedHistoryDto;
import kg.one.flat.Models.Flats;
import kg.one.flat.Models.Users;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface BookedHistoryRepo extends BaseRepository<BookedHisotory> {
    BookedHisotory findByUsersAndAddTimeIsAfter(Users user, LocalDateTime date);
    BookedHisotory findByFlats(Flats flats);
}
