package com.beanbean.expandrecyclerview.holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.beanbean.expandrecyclerview.R;

public class GroupHolder extends RecyclerView.ViewHolder {
    public TextView group_title;

    public GroupHolder(@NonNull View itemView) {
        super(itemView);
        group_title = itemView.findViewById(R.id.group_title);
    }
}
