package kg.one.flat.Service.Impl;

import kg.one.flat.Models.Cities;
import kg.one.flat.Models.Dto.CitiesDto;
import kg.one.flat.Models.Mapper.CitiesMapper;
import kg.one.flat.Repository.CitiesRepo;
import org.springframework.stereotype.Service;

@Service
public class CitiesServiceImpl extends BaseServiceImpl<Cities, CitiesDto, CitiesMapper, CitiesRepo>{
    public CitiesServiceImpl(CitiesRepo repo, CitiesMapper mapper) {
        super(repo, mapper);
    }
}
