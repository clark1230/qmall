package com.qmall.utils;

import com.qmall.goods.entity.Brand;

import java.io.Serializable;
import java.util.List;

/**
 * 用于服务器返回分页后的数据
 * @param <T>
 */
public class LayuiTable<T> implements Serializable{
    private int code;
    private String msg;
    private long count;
    private List<Brand> data;

    public LayuiTable() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<Brand> getData() {
        return data;
    }

    public void setData(List<Brand> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LayuiTable{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
