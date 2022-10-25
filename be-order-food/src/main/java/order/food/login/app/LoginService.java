package order.food.login.app;

import order.food.common.utils.SingleResponse;
import order.food.login.request.UserRequestDto;

public interface LoginService {

    SingleResponse login(UserRequestDto userRequestDto);
}
