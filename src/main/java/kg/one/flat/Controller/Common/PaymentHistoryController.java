package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Models.Dto.PaymentHistoryDto;
import kg.one.flat.Models.PaymentHistory;
import kg.one.flat.Service.Impl.PaymentsHistoryServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/paymentHistory")
public class PaymentHistoryController extends BaseController<PaymentHistory, PaymentHistoryDto, PaymentsHistoryServiceImpl> {
    protected PaymentHistoryController(PaymentsHistoryServiceImpl service) {
        super(service);
    }
}
