package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.Dto.RequestsHistoryDto;
import kg.one.flat.Models.Mapper.RequestsHistoryMapper;
import kg.one.flat.Models.RequestsHistory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RequestsHistoryMapperImpl implements RequestsHistoryMapper {
    @Override
    public RequestsHistory toEntity(RequestsHistoryDto requestsHistoryDto) {
        return RequestsHistoryMapper.INSTANCE.toEntity(requestsHistoryDto);
    }

    @Override
    public RequestsHistoryDto toDto(RequestsHistory requestsHistory) {
        return RequestsHistoryMapper.INSTANCE.toDto(requestsHistory);
    }

    @Override
    public List<RequestsHistory> toListEntity(List<RequestsHistoryDto> d) {
        return RequestsHistoryMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<RequestsHistoryDto> toListDto(List<RequestsHistory> e) {
        return RequestsHistoryMapper.INSTANCE.toListDto(e);
    }
}
