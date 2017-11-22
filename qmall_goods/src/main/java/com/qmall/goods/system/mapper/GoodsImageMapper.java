package com.qmall.goods.system.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.qmall.goods.entity.GoodsImages;

public interface GoodsImageMapper {

	void insertTbGoodsImage(GoodsImages tbGoodsImage);

	void deleteTbGoodsImageByImageId(Integer imageId);

	void updateTbGoodsImage(GoodsImages tbGoodsImage);

	List<GoodsImages> searchTbGoodsImageByParams(@Param("map") Map<String, String> map);

} 
