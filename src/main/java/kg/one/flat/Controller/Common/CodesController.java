package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Models.Codes;
import kg.one.flat.Models.Dto.CodesDto;
import kg.one.flat.Service.Impl.CodesServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/codes")
public class CodesController extends BaseController<Codes, CodesDto, CodesServiceImpl> {
    public CodesController(CodesServiceImpl service) {
        super(service);
    }
}
