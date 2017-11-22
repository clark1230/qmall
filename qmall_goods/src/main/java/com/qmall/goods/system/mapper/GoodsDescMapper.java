package com.qmall.goods.system.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.qmall.goods.entity.GoodsDesc;

public interface GoodsDescMapper {

	void insertTbGoodsDesc(GoodsDesc tbGoodsDesc);

	void deleteTbGoodsDescByGoodsId(Integer goodsId);

	void updateTbGoodsDesc(GoodsDesc tbGoodsDesc);


	List<GoodsDesc> searchTbGoodsDescByParams(@Param("map") Map<String, String> map);

} 
