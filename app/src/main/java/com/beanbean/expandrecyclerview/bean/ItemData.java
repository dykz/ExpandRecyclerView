package com.beanbean.expandrecyclerview.bean;

public class ItemData {
    public static final int DEFAULT_INDEX=-1;

    private int itemType= DEFAULT_INDEX;//类型
    private int itemId;//一级数据的position

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}
