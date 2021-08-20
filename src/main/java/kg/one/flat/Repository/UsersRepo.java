package kg.one.flat.Repository;

import kg.one.flat.Models.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends BaseRepository<Users>{
    Users findByPhone(String phone);
}
