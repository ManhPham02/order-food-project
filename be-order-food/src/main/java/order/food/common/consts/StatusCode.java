package order.food.common.consts;

public class StatusCode {

    private StatusCode() throws IllegalAccessException {
        throw new IllegalAccessException("Status Code Class");
    }

    public static final String STATUS_CODE_OK = "200";
    public static final String STATUS_CODE_NOT_FOUND = "404";
    public static final String STATUS_CODE_SERVER_ERROR = "500";

}
