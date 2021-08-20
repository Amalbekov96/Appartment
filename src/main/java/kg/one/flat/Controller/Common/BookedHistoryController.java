package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Models.BookedHisotory;
import kg.one.flat.Models.Dto.BookedHistoryDto;
import kg.one.flat.Service.Impl.BookedHistoryServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bookedHistory")
public class BookedHistoryController extends BaseController<BookedHisotory, BookedHistoryDto, BookedHistoryServiceImpl> {
    public BookedHistoryController(BookedHistoryServiceImpl service) {
        super(service);
    }
}
