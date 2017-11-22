package com.qmall.goods.system.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.qmall.goods.entity.GoodsCategory;

public interface GoodsCategoryMapper {
	/**
	 * 添加目录信息
	 * @param tbGoodsCategory
	 */
	void addCat(GoodsCategory tbGoodsCategory);

	/**
	 * 删除目录信息
	 * @param categoryId
	 */
	void deleteByCatId(Integer categoryId);

	/**
	 * 修改目录信息
	 * @param tbGoodsCategory
	 */
	void updateCat(GoodsCategory tbGoodsCategory);

	/**
	 * 根据参数查询目录信息
	 * @param map
	 * @return
	 */
	List<GoodsCategory> searchCat(@Param("map") Map<String, String> map);

} 
