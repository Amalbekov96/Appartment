package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Models.Cities;
import kg.one.flat.Models.Dto.CitiesDto;
import kg.one.flat.Service.Impl.CitiesServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cities")
public class CitiesController extends BaseController<Cities, CitiesDto, CitiesServiceImpl> {

    public CitiesController(CitiesServiceImpl service) {
        super(service);
    }
}
