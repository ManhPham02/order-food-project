package order.food.common.utils;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import order.food.common.consts.StatusCode;
import org.springframework.data.domain.PageImpl;

import java.util.List;

@Getter
@Setter
@ToString
public class ListBaseResponse<T> extends BaseResponse{
    private List<T> data;
    private Pagination pagination;

    public ListBaseResponse(PageImpl<T> data) {
        this.data = data.getContent();
        this.pagination = new Pagination();

        pagination.setTotal(data.getTotalElements());
        pagination.setPageSize(data.getSize());
        pagination.setTotalPage(data.getTotalPages());
        pagination.setPageNumber(data.getNumber());

        this.code = StatusCode.STATUS_CODE_OK;
        this.message = "Success";
    }

    @Data
    static class Pagination {
        private int pageSize;
        private int pageNumber;
        private int totalPage;
        private long total;
    }
}
