package com.beanbean.expandrecyclerview.bean;

import java.util.List;

public class Data {
    private String headerTitle;
    private String groupTitle;
    private List<ChildData> childDataList;

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public String getGroupTitle() {
        return groupTitle;
    }

    public void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle;
    }

    public List<ChildData> getChildDataList() {
        return childDataList;
    }

    public void setChildDataList(List<ChildData> childDataList) {
        this.childDataList = childDataList;
    }
}
