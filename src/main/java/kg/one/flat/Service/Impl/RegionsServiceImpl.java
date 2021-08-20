package kg.one.flat.Service.Impl;

import kg.one.flat.Models.Dto.RegionsDto;
import kg.one.flat.Models.Mapper.RegionsMapper;
import kg.one.flat.Models.Regions;
import kg.one.flat.Repository.RegionsRepo;
import org.springframework.stereotype.Service;

@Service
public class RegionsServiceImpl extends BaseServiceImpl<Regions, RegionsDto, RegionsMapper, RegionsRepo>{
    public RegionsServiceImpl(RegionsRepo repo, RegionsMapper mapper) {
        super(repo, mapper);
    }
}
