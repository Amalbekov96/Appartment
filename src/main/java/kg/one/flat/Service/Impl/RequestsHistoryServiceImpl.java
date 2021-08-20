package kg.one.flat.Service.Impl;

import kg.one.flat.Models.Dto.RequestsHistoryDto;
import kg.one.flat.Models.Mapper.RequestsHistoryMapper;
import kg.one.flat.Models.RequestsHistory;
import kg.one.flat.Repository.RequestsHistoryRepo;
import org.springframework.stereotype.Service;

@Service
public class RequestsHistoryServiceImpl extends BaseServiceImpl<RequestsHistory, RequestsHistoryDto, RequestsHistoryMapper, RequestsHistoryRepo>{
    public RequestsHistoryServiceImpl(RequestsHistoryRepo repo, RequestsHistoryMapper mapper) {
        super(repo, mapper);
    }
}
