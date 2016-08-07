package com.xzh.recyclerview.base;

import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.xzh.recyclerview.callback.PinnedHeaderNotifyer;
import com.xzh.recyclerview.utils.FullSpanUtil;

import java.util.List;

public abstract class BaseHeaderAdapter<T extends MultiItemEntity> extends BaseMultiItemQuickAdapter<T> implements PinnedHeaderNotifyer<T> {

    public static final int TYPE_HEADER = 1;
    public static final int TYPE_DATA = 2;

    public BaseHeaderAdapter(List<T> data) {
        super(data);
        addItemTypes();
    }

    protected abstract void addItemTypes();


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        FullSpanUtil.onAttachedToRecyclerView(recyclerView, this, TYPE_HEADER);
    }

    @Override
    public void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        FullSpanUtil.onViewAttachedToWindow(holder, this, TYPE_HEADER);
    }
}
