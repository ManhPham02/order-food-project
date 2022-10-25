package order.food.login.response;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserReponseDto {
    private String username;
    private String password;
    private List<String> role;
}
