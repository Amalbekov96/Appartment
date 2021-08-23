package kg.one.flat.Service.Impl;

import kg.one.flat.Models.Dto.PaymentHistoryDto;
import kg.one.flat.Models.Mapper.PaymentHistoryMapper;
import kg.one.flat.Models.PaymentHistory;
import kg.one.flat.Repository.PaymentHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PaymentsHistoryServiceImpl extends BaseServiceImpl<PaymentHistory, PaymentHistoryDto, PaymentHistoryMapper, PaymentHistoryRepo>{
    public PaymentsHistoryServiceImpl(PaymentHistoryRepo repo, PaymentHistoryMapper mapper) {
        super(repo, mapper);
    }

    @Autowired
    private PaymentHistoryMapper paymentHistoryMapper;
    @Autowired
    private PaymentHistoryRepo paymentHistoryRepo;

    @Override
    public ResponseEntity<?> create(PaymentHistoryDto paymentHistoryDto) {

        if(paymentHistoryDto.getBookedHisotory().getTotalPrice() > paymentHistoryDto.getPrice()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("you dont have enough money!");
        } else {
            double change = paymentHistoryDto.getPrice() - paymentHistoryDto.getBookedHisotory().getTotalPrice();
            paymentHistoryDto.setPrice(paymentHistoryDto.getBookedHisotory().getTotalPrice());
            paymentHistoryMapper.toDto(paymentHistoryRepo.save(paymentHistoryMapper.toEntity(paymentHistoryDto)));
            return ResponseEntity.status(HttpStatus.OK).body("Your payment was made successfully and here is your changes " + change);
        }
    }
}
