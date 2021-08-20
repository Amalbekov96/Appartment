package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Exceptions.EntityNotFound;
import kg.one.flat.Models.Codes;
import kg.one.flat.Models.Dto.CodesDto;
import kg.one.flat.Models.Dto.UsersDto;
import kg.one.flat.Models.Users;
import kg.one.flat.Service.Impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Random;

@RestController
@RequestMapping("/api/v1/user")
public class UsersController extends BaseController<Users, UsersDto, UsersServiceImpl> {
    protected UsersController(UsersServiceImpl service) {
        super(service);
    }

    @Autowired
    private UsersServiceImpl usersService;

    @GetMapping("/login")
    ResponseEntity<?> logInOrSignUp(@RequestParam String phone, @RequestParam Boolean isBroker){
        return ResponseEntity.ok(usersService.findUserByPhone(phone, isBroker));
    }
}
