package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.Dto.RequestsHistoryDto;
import kg.one.flat.Models.RequestsHistory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface RequestsHistoryMapper extends BaseMapper<RequestsHistory, RequestsHistoryDto>{
    RequestsHistoryMapper INSTANCE = Mappers.getMapper(RequestsHistoryMapper.class);
}
