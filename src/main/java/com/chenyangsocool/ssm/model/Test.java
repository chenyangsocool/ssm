package com.chenyangsocool.ssm.model;

public class Test {
    private int id;

    private String context;

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
