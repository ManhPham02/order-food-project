package order.food.login.mapper;


import order.food.login.request.UserRequestDto;
import order.food.login.response.UserReponseDto;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
@Primary
public interface LoginMapper {

    UserReponseDto getUserLogin(@Param("userReq") UserRequestDto userRequestDto);

    List<String> getRoleByUsername(@Param("username") String username);

}
