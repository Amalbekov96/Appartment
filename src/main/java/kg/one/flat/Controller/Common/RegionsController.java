package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Models.Dto.RegionsDto;
import kg.one.flat.Models.Regions;
import kg.one.flat.Service.Impl.RegionsServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/regions")
public class RegionsController extends BaseController<Regions, RegionsDto, RegionsServiceImpl> {
    protected RegionsController(RegionsServiceImpl service) {
        super(service);
    }
}
