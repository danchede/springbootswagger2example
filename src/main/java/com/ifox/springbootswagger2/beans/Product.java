package com.ifox.springbootswagger2.beans;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in9:25 2018/6/22
 * @Modified By:
 */
@ApiModel(value = "产品信息")

public class Product {
    @ApiModelProperty(required = true,name = "name",value = "产品名称",dataType = "query")
    private String name;
    @ApiModelProperty(required = true,value = "产品类型",dataType = "quety")
    private String type;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
