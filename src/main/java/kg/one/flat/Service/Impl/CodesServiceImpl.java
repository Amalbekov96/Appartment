package kg.one.flat.Service.Impl;

import kg.one.flat.Models.Codes;
import kg.one.flat.Models.Dto.CodesDto;
import kg.one.flat.Models.Mapper.CodesMapper;
import kg.one.flat.Models.Mapper.Impl.CodesMapperImpl;
import kg.one.flat.Repository.CodesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodesServiceImpl extends BaseServiceImpl<Codes, CodesDto, CodesMapper, CodesRepo>{
    public CodesServiceImpl(CodesRepo repo, CodesMapper mapper) {
        super(repo, mapper);
    }

    @Autowired
    private CodesRepo codesRepo;
    @Autowired
    private CodesMapper codesMapper;

    public CodesDto findByCode(String code) {
        return codesMapper.toDto(codesRepo.findByCode(code));
    }
}
