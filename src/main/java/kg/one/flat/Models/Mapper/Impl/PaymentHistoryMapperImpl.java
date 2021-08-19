package kg.one.flat.Models.Mapper.Impl;

import kg.one.flat.Models.Dto.PaymentHistoryDto;
import kg.one.flat.Models.Mapper.PaymentHistoryMapper;
import kg.one.flat.Models.PaymentHistory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaymentHistoryMapperImpl implements PaymentHistoryMapper {
    @Override
    public PaymentHistory toEntity(PaymentHistoryDto paymentHistoryDto) {
        return PaymentHistoryMapper.INSTANCE.toEntity(paymentHistoryDto);
    }

    @Override
    public PaymentHistoryDto toDto(PaymentHistory paymentHistory) {
        return PaymentHistoryMapper.INSTANCE.toDto(paymentHistory);
    }

    @Override
    public List<PaymentHistory> toListEntity(List<PaymentHistoryDto> d) {
        return PaymentHistoryMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<PaymentHistoryDto> toListDto(List<PaymentHistory> e) {
        return PaymentHistoryMapper.INSTANCE.toListDto(e);
    }
}
