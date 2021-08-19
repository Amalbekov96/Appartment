package kg.one.flat.Service;

import kg.one.flat.Models.BaseEntity;
import kg.one.flat.Models.Dto.BaseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseService<D extends BaseDto> {

    D findById(Long id);
    D updateById(D d);
    D create(D d);
    void deleteById(Long id);
    List<D> findAll();
}
