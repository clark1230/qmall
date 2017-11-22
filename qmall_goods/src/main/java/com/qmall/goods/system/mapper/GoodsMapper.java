package com.qmall.goods.system.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.qmall.goods.entity.Goods;

public interface GoodsMapper {

	void insertTbGood(Goods tbGood);

	void deleteTbGoodByGoodsId(Integer goodsId);

	void updateTbGood(Goods tbGood);


	List<Goods> searchTbGoodByParams(@Param("map") Map<String, String> map);

} 
