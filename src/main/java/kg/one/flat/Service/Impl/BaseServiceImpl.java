package kg.one.flat.Service.Impl;

import kg.one.flat.Exceptions.EntityNotFound;
import kg.one.flat.Models.BaseEntity;
import kg.one.flat.Models.Dto.BaseDto;
import kg.one.flat.Models.Mapper.BaseMapper;
import kg.one.flat.Repository.BaseRepository;
import kg.one.flat.Service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class BaseServiceImpl< E extends BaseEntity, D extends BaseDto, M extends BaseMapper<E, D>, R extends BaseRepository<E>> implements BaseService<D> {

    @Autowired
    private R repo;
    @Autowired
    private M mapper;

    @Override
    public D findById(Long id) {
        return mapper.toDto(repo.findById(id).orElseThrow(()-> new EntityNotFound("Was not found")));
    }

    @Override
    public D updateById(D d) {
        return mapper.toDto(repo.save(mapper.toEntity(d)));
    }

    @Override
    public D create(D d) {
        return mapper.toDto(repo.save(mapper.toEntity(d)));
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<D> findAll() {
        return mapper.toListDto(repo.findAll());
    }
}
