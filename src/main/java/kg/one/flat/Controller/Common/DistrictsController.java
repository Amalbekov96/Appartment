package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Models.Districts;
import kg.one.flat.Models.Dto.DistrictsDto;
import kg.one.flat.Service.Impl.DistrictsServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/districts")
public class DistrictsController extends BaseController<Districts, DistrictsDto, DistrictsServiceImpl> {
    public DistrictsController(DistrictsServiceImpl service) {
        super(service);
    }
}
