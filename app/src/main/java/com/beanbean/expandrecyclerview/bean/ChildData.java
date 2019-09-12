package com.beanbean.expandrecyclerview.bean;

public class ChildData extends ItemData{
    private int subItemId;//二级数据展示下标
    private String desc;
    private int viewType;
    private int value;
    private String remark;

    public int getSubItemId() {
        return subItemId;
    }

    public void setSubItemId(int subItemId) {
        this.subItemId = subItemId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
