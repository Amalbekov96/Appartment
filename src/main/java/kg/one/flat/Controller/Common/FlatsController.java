package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Models.Dto.FlatsDto;
import kg.one.flat.Models.Flats;
import kg.one.flat.Service.Impl.FlatsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/flats")
public class FlatsController extends BaseController<Flats, FlatsDto, FlatsServiceImpl> {
    protected FlatsController(FlatsServiceImpl service) {
        super(service);
    }
}
