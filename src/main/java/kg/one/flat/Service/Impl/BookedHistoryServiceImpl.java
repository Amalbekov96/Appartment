package kg.one.flat.Service.Impl;

import kg.one.flat.Models.BookedHisotory;
import kg.one.flat.Models.Dto.BookedHistoryDto;
import kg.one.flat.Models.Mapper.BookedHistoryMapper;
import kg.one.flat.Repository.BookedHistoryRepo;
import org.springframework.stereotype.Service;

@Service
public class BookedHistoryServiceImpl extends BaseServiceImpl<BookedHisotory, BookedHistoryDto, BookedHistoryMapper, BookedHistoryRepo>{
    public BookedHistoryServiceImpl(BookedHistoryRepo repo, BookedHistoryMapper mapper) {
        super(repo, mapper);
    }
}
