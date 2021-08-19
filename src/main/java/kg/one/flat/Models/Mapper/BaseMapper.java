package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.BaseEntity;
import kg.one.flat.Models.Dto.BaseDto;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface BaseMapper<E extends BaseEntity, D extends BaseDto> {
    E toEntity(D d);
    D toDto(E e);
    List<E> toListEntity(List<D> d);
    List<D> toListDto(List<E> e);
}
