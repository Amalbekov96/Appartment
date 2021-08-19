package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.BookedHisotory;
import kg.one.flat.Models.Dto.BookedHistoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface BookedHistoryMapper extends BaseMapper<BookedHisotory, BookedHistoryDto>{
    BookedHistoryMapper INSTANCE = Mappers.getMapper(BookedHistoryMapper.class);
}
