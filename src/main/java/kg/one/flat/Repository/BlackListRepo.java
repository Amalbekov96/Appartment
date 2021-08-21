package kg.one.flat.Repository;

import kg.one.flat.Models.BlackList;
import kg.one.flat.Models.Dto.BlackListDto;
import kg.one.flat.Models.Dto.UsersDto;
import kg.one.flat.Models.Users;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
@Repository
public interface BlackListRepo extends BaseRepository<BlackList>{
    BlackList findByUserAndEndTimeIsAfter(Users users, LocalDateTime now);
}
