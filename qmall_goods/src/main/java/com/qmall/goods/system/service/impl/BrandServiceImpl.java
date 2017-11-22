package com.qmall.goods.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qmall.goods.entity.Brand;
import com.qmall.goods.system.mapper.BrandMapper;
import com.qmall.goods.system.service.BrandService;
import com.qmall.utils.LayuiTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("brandService")
public class BrandServiceImpl implements BrandService {
    /**
     * 自动注入GoodsMapper实例
     */
    @Autowired
    private BrandMapper brandMapper;
    @Override
    public LayuiTable<Brand> page(int offset, int limit) {
        LayuiTable<Brand> layuiTable = new LayuiTable<>();
        PageHelper.startPage(offset,limit);
        List<Brand> brandList = brandMapper.searchTbBrandByParams(null);
        PageInfo<Brand> pageInfo = new PageInfo<>(brandList);
        layuiTable.setCount(pageInfo.getTotal());
        layuiTable.setData(pageInfo.getList());
        return layuiTable;
    }
}
