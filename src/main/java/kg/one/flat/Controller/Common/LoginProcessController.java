package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Models.BaseEntity;
import kg.one.flat.Models.Codes;
import kg.one.flat.Models.Dto.LoginProcessDto;
import kg.one.flat.Models.LoginProcess;
import kg.one.flat.Models.Users;
import kg.one.flat.Service.Impl.FlatsServiceImpl;
import kg.one.flat.Service.Impl.LoginProcessServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/loginProcess")
public class LoginProcessController extends BaseController<LoginProcess, LoginProcessDto, LoginProcessServiceImpl> {
    protected LoginProcessController(LoginProcessServiceImpl service) {
        super(service);
    }

    @Autowired
    private LoginProcessServiceImpl loginProcessService;

    @PostMapping("/loginWithCode")
    ResponseEntity<?> getAllPostedFlats(@RequestBody Codes code){
        return ResponseEntity.ok(loginProcessService.findAllPostedFlats(code));
    }
}
