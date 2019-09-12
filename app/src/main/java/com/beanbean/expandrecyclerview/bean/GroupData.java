package com.beanbean.expandrecyclerview.bean;

import java.util.List;

public class GroupData  extends ItemData{
    private String title;
    private boolean showExpand;
    private boolean expand;//是否展开
    private List<ChildData> productList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isShowExpand() {
        return showExpand;
    }

    public void setShowExpand(boolean showExpand) {
        this.showExpand = showExpand;
    }

    public boolean isExpand() {
        return expand;
    }

    public void setExpand(boolean expand) {
        this.expand = expand;
    }

    public List<ChildData> getProductList() {
        return productList;
    }

    public void setProductList(List<ChildData> productList) {
        this.productList = productList;
    }
}
