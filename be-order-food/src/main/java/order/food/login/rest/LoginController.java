package order.food.login.rest;

import order.food.common.utils.SingleResponse;
import order.food.login.app.LoginService;
import order.food.login.request.UserRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/")
    private SingleResponse login(@RequestBody UserRequestDto userRequestDto) {
        return loginService.login(userRequestDto);
    }

}
