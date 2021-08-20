package kg.one.flat.Service.Impl;

import kg.one.flat.Models.Dto.VideosDto;
import kg.one.flat.Models.Mapper.VideosMapper;
import kg.one.flat.Models.Videos;
import kg.one.flat.Repository.VideosRepo;
import org.springframework.stereotype.Service;

@Service
public class VideosServiceImpl extends BaseServiceImpl<Videos, VideosDto, VideosMapper, VideosRepo>{
    public VideosServiceImpl(VideosRepo repo, VideosMapper mapper) {
        super(repo, mapper);
    }
}
