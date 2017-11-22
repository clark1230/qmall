package com.qmall.goods.system.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.qmall.goods.entity.Brand;

/**
 * 品牌接口映射器
 */
public interface BrandMapper {
	/**
	 * 添加品牌
	 * @param tbBrand
	 */
	int addBrand(Brand tbBrand);

	/**
	 * 根据品牌编号删除品牌信息
	 * @param brandId
	 * @return
	 */
	int deleteById(Integer brandId);

	/**
	 * 修改品牌信息
	 * @param tbBrand
	 * @return
	 */
	int updateBrand(Brand tbBrand);

	/**
	 * 查询品牌信息
	 * @param map
	 * @return
	 */
	List<Brand> searchTbBrandByParams(@Param("map") Map<String, String> map);

} 
