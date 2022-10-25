package order.food.common.utils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import order.food.common.consts.StatusCode;

@Getter
@Setter
@ToString
public class SingleResponse<T> extends BaseResponse{
    private T data;

    public SingleResponse(T data) {
        this.data = data;
        code = StatusCode.STATUS_CODE_OK;
        message = "Success";
    }

    public SingleResponse() {
    }
}
