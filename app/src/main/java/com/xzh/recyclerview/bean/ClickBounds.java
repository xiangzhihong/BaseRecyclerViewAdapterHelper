package com.xzh.recyclerview.bean;

public class ClickBounds {

    private int mLeft;
    private int mTop;
    private int mRight;
    private int mBottom;

    private int mFirstTop;
    private int mFirstBottom;

    public ClickBounds(int left, int top, int right, int bottom) {
        mLeft = left;
        mTop = top;
        mRight = right;
        mBottom = bottom;

        mFirstTop = top;
        mFirstBottom = bottom;
    }

    public void setBounds(int left, int top, int right, int bottom) {
        mLeft = left;
        mTop = top;
        mRight = right;
        mBottom = bottom;
    }

    public int getLeft() {
        return mLeft;
    }

    public int getTop() {
        return mTop;
    }

    public int getRight() {
        return mRight;
    }

    public int getBottom() {
        return mBottom;
    }

    public void setBottom(int bottom) {
        mBottom = bottom;
    }

    public void setLeft(int left) {
        mLeft = left;
    }

    public void setTop(int top) {
        mTop = top;
    }

    public void setRight(int right) {
        mRight = right;
    }

    public int getFirstBottom() {
        return mFirstBottom;
    }

    @Override
    public String toString() {
        return "ClickBounds{" +
                "mLeft=" + mLeft +
                ", mTop=" + mTop +
                ", mRight=" + mRight +
                ", mBottom=" + mBottom +
                ", mFirstTop=" + mFirstTop +
                ", mFirstBottom=" + mFirstBottom +
                '}';
    }

    public int getFirstTop() {
        return mFirstTop;
    }
}
