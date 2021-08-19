package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.BookedHisotory;
import kg.one.flat.Models.Dto.BookedHistoryDto;
import kg.one.flat.Models.Mapper.BookedHistoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookedHistoryMapperImpl implements BookedHistoryMapper {
    @Override
    public BookedHisotory toEntity(BookedHistoryDto bookedHistoryDto) {
        return BookedHistoryMapper.INSTANCE.toEntity(bookedHistoryDto);
    }

    @Override
    public BookedHistoryDto toDto(BookedHisotory bookedHisotory) {
        return BookedHistoryMapper.INSTANCE.toDto(bookedHisotory);
    }

    @Override
    public List<BookedHisotory> toListEntity(List<BookedHistoryDto> d) {
        return BookedHistoryMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<BookedHistoryDto> toListDto(List<BookedHisotory> e) {
        return BookedHistoryMapper.INSTANCE.toListDto(e);
    }
}
