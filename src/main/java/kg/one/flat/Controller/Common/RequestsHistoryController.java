package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Models.Dto.RequestsHistoryDto;
import kg.one.flat.Models.RequestsHistory;
import kg.one.flat.Service.Impl.RequestsHistoryServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/requestsController")
public class RequestsHistoryController extends BaseController<RequestsHistory, RequestsHistoryDto, RequestsHistoryServiceImpl> {
    protected RequestsHistoryController(RequestsHistoryServiceImpl service) {
        super(service);
    }
}
