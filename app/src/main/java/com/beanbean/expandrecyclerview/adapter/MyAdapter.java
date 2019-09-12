package com.beanbean.expandrecyclerview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.beanbean.expandrecyclerview.ItemType;
import com.beanbean.expandrecyclerview.R;
import com.beanbean.expandrecyclerview.bean.ItemData;
import com.beanbean.expandrecyclerview.holder.ChildHolder;
import com.beanbean.expandrecyclerview.holder.GroupHolder;
import com.beanbean.expandrecyclerview.holder.HeaderHolder;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter {
    private Context mContext;
    protected List<ItemData> mData;//传入的data
    protected List<ItemData> mAllOrders = new ArrayList<>();//展示的data
    private LayoutInflater layoutInflater;

    public MyAdapter(Context context, List<ItemData> data) {
        mContext = context;
        mData = data;
        layoutInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        RecyclerView.ViewHolder viewHolder;
        switch (viewType) {
            case ItemType.TYPE_HEADER:
                View v = layoutInflater.inflate(R.layout.item_header, viewGroup, false);
                viewHolder = new HeaderHolder(v);
                break;
            case ItemType.TYPE_GROUP:
                View v1 = layoutInflater.inflate(R.layout.item_group, viewGroup, false);
                viewHolder = new GroupHolder(v1);
                break;
            case ItemType.TYPE_CHILD:
                View v2 = layoutInflater.inflate(R.layout.item_child, viewGroup, false);
                viewHolder = new ChildHolder(v2);
                break;
            default:
                viewHolder = null;
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int pos) {
        ItemData obj = mAllOrders.get(pos);
        if (viewHolder instanceof HeaderHolder) {
            bindHeader((HeaderHolder) viewHolder, obj, pos);
        } else if (viewHolder instanceof GroupHolder) {
            bindGroup((GroupHolder) viewHolder, obj, pos);
        } else if (viewHolder instanceof ChildHolder) {
            bindChild((ChildHolder) viewHolder, obj, pos);
        }
    }

    private void bindHeader(HeaderHolder viewHolder, ItemData obj, int pos) {
    }

    private void bindGroup(GroupHolder viewHolder, ItemData obj, int pos) {

       /* //更新数据
        if(productGroupData.isExpand()){//收起
            notifyItemRangeRemoved(productGroupHolder.getAdapterPosition() + 1, productGroupData.getProductList().size());
        }else{//展开
            notifyItemRangeInserted(productGroupHolder.getAdapterPosition() + 1, productGroupData.getProductList().size());
        }
        productGroupData.setExpand(!productGroupData.isExpand());
        notifyItemChanged(productGroupHolder.getAdapterPosition());*/

    }

    private void bindChild(ChildHolder viewHolder, ItemData obj, int pos) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return mAllOrders.get(position).getItemType();
    }
}
