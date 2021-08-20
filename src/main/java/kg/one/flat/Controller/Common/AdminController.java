package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Models.Admins;
import kg.one.flat.Models.Dto.AdminsDto;
import kg.one.flat.Service.Impl.AdminsServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admins")
public class AdminController extends BaseController<Admins, AdminsDto, AdminsServiceImpl> {
    public AdminController(AdminsServiceImpl service) {
        super(service);
    }
}
