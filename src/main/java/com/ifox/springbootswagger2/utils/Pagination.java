package com.ifox.springbootswagger2.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in9:36 2018/6/22
 * @Modified By:
 */
@ApiModel(value = "分页信息")
public class Pagination {
    @ApiModelProperty(required = true, name = "pageCurrent", value = "当前选择页", dataType = "query")
    private String pageCurrent;
    @ApiModelProperty(required = true, name = "pageSize", value = "每页条数", dataType = "query")
    private String pageSize;

    public String getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(String pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isRequire() {
        if (this == null) {
            return false;
        }
        if (this.getPageCurrent() == null || "".equals(this.getPageCurrent())) {
            return false;
        }
        return this.getPageSize() != null && !"".equals(this.getPageSize());
    }

}
