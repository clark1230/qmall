package com.qmall.user.system.service;

import java.io.Serializable;

public interface IBaseService<T> {
    /**
     * 添加信息
     * @param t
     * @return
     */
    public int add(T t);

    /**
     * 根据id修改数据
     * @param t
     * @return
     */
    public int update(T t);

    /**
     * 根据id删除数据
     * @param id
     * @return
     */
    public int deleteById(Serializable id);

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    public T findById(Serializable id);
    
}
