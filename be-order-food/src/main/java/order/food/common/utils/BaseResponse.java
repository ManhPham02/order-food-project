package order.food.common.utils;

import com.google.common.base.Strings;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import order.food.common.consts.StatusCode;

@Getter
@Setter
@ToString
public class BaseResponse {
    protected String code;
    protected String message;

    public BaseResponse() {
    }

    public BaseResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static class Builder {
        public static BaseResponse success() {
            return new BaseResponse(StatusCode.STATUS_CODE_OK, "Success");
        }

        public static BaseResponse success(String message) {
            if (Strings.isNullOrEmpty(message)) {
                return success();
            } else return new BaseResponse(StatusCode.STATUS_CODE_OK, "Success");
        }

        public static BaseResponse findNotFound() {
            return new BaseResponse(StatusCode.STATUS_CODE_NOT_FOUND, "Find not found");
        }

        public static BaseResponse serverError() {
            return new BaseResponse(StatusCode.STATUS_CODE_SERVER_ERROR, "Server error");
        }

        public static BaseResponse build(String code, String message) {
            return new BaseResponse(code, message);
        }
    }

}
