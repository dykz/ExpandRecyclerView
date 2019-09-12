package com.beanbean.expandrecyclerview.holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.beanbean.expandrecyclerview.R;

public class ChildHolder extends RecyclerView.ViewHolder {
    public TextView child_desc;
    public EditText et_remark;

    public ChildHolder(@NonNull View itemView) {
        super(itemView);
        child_desc = itemView.findViewById(R.id.child_desc);
        et_remark = itemView.findViewById(R.id.et_remark);
    }
}
