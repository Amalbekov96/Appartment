package kg.one.flat.Service.Impl;

import kg.one.flat.Exceptions.UserBlockedException;
import kg.one.flat.Models.Codes;
import kg.one.flat.Models.Dto.BlackListDto;
import kg.one.flat.Models.Dto.CodesDto;
import kg.one.flat.Models.Dto.FlatsDto;
import kg.one.flat.Models.Dto.UsersDto;
import kg.one.flat.Models.Flats;
import kg.one.flat.Models.Mapper.CodesMapper;
import kg.one.flat.Models.Mapper.FlatsMapper;
import kg.one.flat.Models.Mapper.UsersMapper;
import kg.one.flat.Repository.CodesRepo;
import kg.one.flat.Repository.FlatsRepo;
import kg.one.flat.Repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FlatsServiceImpl extends BaseServiceImpl<Flats, FlatsDto, FlatsMapper, FlatsRepo>{
    public FlatsServiceImpl(FlatsRepo repo, FlatsMapper mapper) {
        super(repo, mapper);
    }



}
