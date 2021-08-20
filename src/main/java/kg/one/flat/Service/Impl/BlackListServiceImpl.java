package kg.one.flat.Service.Impl;

import kg.one.flat.Models.BlackList;
import kg.one.flat.Models.Dto.BlackListDto;
import kg.one.flat.Models.Mapper.BlackListMapper;
import kg.one.flat.Repository.BlackListRepo;

public class BlackListServiceImpl extends BaseServiceImpl<BlackList, BlackListDto, BlackListMapper, BlackListRepo>{
    public BlackListServiceImpl(BlackListRepo repo, BlackListMapper mapper) {
        super(repo, mapper);
    }
}
