package kg.one.flat.Service.Impl;

import kg.one.flat.Models.Admins;
import kg.one.flat.Models.Dto.AdminsDto;
import kg.one.flat.Models.Mapper.AdminsMapper;
import kg.one.flat.Repository.AdminsRepo;
import org.springframework.stereotype.Service;

@Service
public class AdminsServiceImpl extends BaseServiceImpl<Admins, AdminsDto, AdminsMapper, AdminsRepo> {
    public AdminsServiceImpl(AdminsRepo repo, AdminsMapper mapper) {
        super(repo, mapper);
    }
}
