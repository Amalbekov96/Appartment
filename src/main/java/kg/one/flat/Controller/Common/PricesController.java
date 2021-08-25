package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Models.Dto.PricesDto;
import kg.one.flat.Models.Prices;
import kg.one.flat.Service.Impl.PricesServiceImpl;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/prices")
public class PricesController extends BaseController<Prices, PricesDto, PricesServiceImpl> {
    protected PricesController(PricesServiceImpl service) {
        super(service);
    }

}
