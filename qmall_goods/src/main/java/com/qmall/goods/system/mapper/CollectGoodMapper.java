package com.qmall.goods.system.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.qmall.goods.entity.CollectGood;

public interface CollectGoodMapper {

	void addCollectGoods(CollectGood tbCollectGood);

	void deleteByColId(Integer colId);

	void updateCollectGoods(CollectGood tbCollectGood);


	List<CollectGood> searcgCollGoods(@Param("map") Map<String, String> map);

} 
