package kg.one.flat.Repository;

import kg.one.flat.Models.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BaseRepository<E extends BaseEntity> extends JpaRepository<E, Long> {
}
