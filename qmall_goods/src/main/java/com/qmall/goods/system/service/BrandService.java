package com.qmall.goods.system.service;

import com.qmall.goods.entity.Brand;
import com.qmall.utils.LayuiTable;

public interface BrandService {
    /**
     * 数据分页
     * @return
     */
    public LayuiTable<Brand> page(int offset,int limit);
}
