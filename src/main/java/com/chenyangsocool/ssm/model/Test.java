package com.chenyangsocool.ssm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="Test",description="Test")//对类进行swagger注解
public class Test {
    @ApiModelProperty(value="测试id",name="id")//对类的字段属性进行swagger注解
    private int id;

    @ApiModelProperty(value="测试内容",name="context")
    private String context;

    @ApiModelProperty(value="测试内容的浏览数",name="viewCount")
    private int viewCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", context='" + context + '\'' +
                ", viewCount=" + viewCount +
                '}';
    }
}
