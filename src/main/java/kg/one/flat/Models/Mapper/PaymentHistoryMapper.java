package kg.one.flat.Models.Mapper;

import kg.one.flat.Models.Dto.PaymentHistoryDto;
import kg.one.flat.Models.PaymentHistory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface PaymentHistoryMapper extends BaseMapper<PaymentHistory, PaymentHistoryDto>{
    PaymentHistoryMapper INSTANCE = Mappers.getMapper(PaymentHistoryMapper.class);
}
