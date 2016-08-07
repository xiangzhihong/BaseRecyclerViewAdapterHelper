package com.xzh.recyclerview.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

public class StockEntity {

    // 振幅榜
    public List<StockInfo> amplitude_list;

    // 跌幅榜
    public List<StockInfo> down_list;

    // 换手率
    public List<StockInfo> change_list;

    // 涨幅榜
    public List<StockInfo> increase_list;

    public static class StockInfo extends MultiItemEntity {

        public static final int TYPE_HEADER = 1;
        public static final int TYPE_DATA = 2;

        public String pinnedHeaderName;

        public double rate;
        public String current_price;
        public String stock_code;
        public String stock_name;

        public StockInfo(int itemType) {
            this.itemType = itemType;
        }

        public StockInfo(int itemType, String pinnedHeaderName) {
            this(itemType);
            this.pinnedHeaderName = pinnedHeaderName;
        }
    }

}
