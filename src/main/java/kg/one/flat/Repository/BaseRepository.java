package kg.one.flat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BaseRepository<E> extends JpaRepository<E, Long> {
    E updateById(Long id);
    E getById(Long id);
    void deleteById(Long id);
    List<E> findAll();
}
