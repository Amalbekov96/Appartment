package kg.one.flat.Service.Impl;

import kg.one.flat.Models.Dto.PaymentHistoryDto;
import kg.one.flat.Models.Mapper.PaymentHistoryMapper;
import kg.one.flat.Models.PaymentHistory;
import kg.one.flat.Repository.PaymentHistoryRepo;
import org.springframework.stereotype.Service;

@Service
public class PaymentsHistoryServiceImpl extends BaseServiceImpl<PaymentHistory, PaymentHistoryDto, PaymentHistoryMapper, PaymentHistoryRepo>{
    public PaymentsHistoryServiceImpl(PaymentHistoryRepo repo, PaymentHistoryMapper mapper) {
        super(repo, mapper);
    }
}
