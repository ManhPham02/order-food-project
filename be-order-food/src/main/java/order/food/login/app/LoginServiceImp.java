package order.food.login.app;


import order.food.common.utils.BaseResponse;
import order.food.common.utils.SingleResponse;
import order.food.login.mapper.LoginMapper;
import order.food.login.request.UserRequestDto;
import order.food.login.response.UserReponseDto;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService{

    private final LoginMapper loginMapper;

    public LoginServiceImp(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    @Override
    public SingleResponse login(UserRequestDto userRequestDto) {
        UserReponseDto user = loginMapper.getUserLogin(userRequestDto);
        user.setRole(loginMapper.getRoleByUsername(user.getUsername()));
        if (user == null) {
            return (SingleResponse) new BaseResponse("500","Khong ton tai");
        } else {
            return new SingleResponse(user);
        }
    }
}
