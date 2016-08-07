package com.xzh.recyclerview.bean;


import com.chad.library.adapter.base.entity.MultiItemEntity;

public class PinnedHeaderEntity<T> extends MultiItemEntity {

    private T data;

    private String pinnedHeaderName;

    public PinnedHeaderEntity(T data, int itemType, String pinnedHeaderName) {
        this.data = data;
        this.itemType = itemType;
        this.pinnedHeaderName = pinnedHeaderName;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPinnedHeaderName(String pinnedHeaderName) {
        this.pinnedHeaderName = pinnedHeaderName;
    }

    public T getData() {
        return data;
    }

    public String getPinnedHeaderName() {
        return pinnedHeaderName;
    }
}
