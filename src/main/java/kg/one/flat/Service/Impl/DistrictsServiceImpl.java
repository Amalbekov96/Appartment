package kg.one.flat.Service.Impl;

import kg.one.flat.Models.Districts;
import kg.one.flat.Models.Dto.DistrictsDto;
import kg.one.flat.Models.Mapper.DistrictsMapper;
import kg.one.flat.Repository.DistrictsRepo;
import org.springframework.stereotype.Service;

@Service
public class DistrictsServiceImpl extends BaseServiceImpl<Districts, DistrictsDto, DistrictsMapper, DistrictsRepo>{
    public DistrictsServiceImpl(DistrictsRepo repo, DistrictsMapper mapper) {
        super(repo, mapper);
    }
}
