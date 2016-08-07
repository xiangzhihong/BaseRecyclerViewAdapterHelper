package com.xzh.recyclerview.callback;

public interface PinnedHeaderNotifyer<T> {

    boolean isPinnedHeaderType(int viewType);

    T getPinnedHeaderInfo(int position);

}
