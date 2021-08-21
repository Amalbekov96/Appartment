package kg.one.flat.Repository;

import kg.one.flat.Models.LoginProcess;
import kg.one.flat.Models.Users;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface LoginProcessRepo extends BaseRepository<LoginProcess> {
    LoginProcess findByUser(Users users);

    List<LoginProcess> findAllByEndTimeIsAfter(LocalDateTime now);
    void deleteAllByEndTimeLessThan(LocalDateTime now);
}
