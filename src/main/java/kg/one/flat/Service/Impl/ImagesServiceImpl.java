package kg.one.flat.Service.Impl;

import kg.one.flat.Models.Dto.ImagesDto;
import kg.one.flat.Models.Images;
import kg.one.flat.Models.Mapper.ImagesMapper;
import kg.one.flat.Repository.ImagesRepo;
import org.springframework.stereotype.Service;

@Service
public class ImagesServiceImpl extends BaseServiceImpl<Images, ImagesDto, ImagesMapper, ImagesRepo>{
    public ImagesServiceImpl(ImagesRepo repo, ImagesMapper mapper) {
        super(repo, mapper);
    }
}
