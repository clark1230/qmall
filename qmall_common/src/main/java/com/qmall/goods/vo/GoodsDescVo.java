package com.qmall.goods.vo;

/**
 * 
 * @author xianyaoji
 */
public class GoodsDescVo {
	/**
	 *  商品编号
	 */
	private Integer goodsId;
	/**
	 *  商品详细描述
	 */
	private String goodsDesc;
	/**
	 *  
	 */
	private java.util.Date createTime;
	/**
	 *  修改时间
	 */
	private java.util.Date updateTime;
	/**
	 * 商品编号
	 * @param goodsId
	 */
	public void setGoodsId(Integer goodsId){
		this.goodsId = goodsId;
	}
	
    /**
     * 商品编号
     * @return Integer
     */	
    public Integer getGoodsId(){
    	return goodsId;
    }
	/**
	 * 商品详细描述
	 * @param goodsDesc
	 */
	public void setGoodsDesc(String goodsDesc){
		this.goodsDesc = goodsDesc;
	}
	
    /**
     * 商品详细描述
     * @return String
     */	
    public String getGoodsDesc(){
    	return goodsDesc;
    }
	/**
	 * 
	 * @param createTime
	 */
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	
    /**
     * 
     * @return java.util.Date
     */	
    public java.util.Date getCreateTime(){
    	return createTime;
    }
	/**
	 * 修改时间
	 * @param updateTime
	 */
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
	
    /**
     * 修改时间
     * @return java.util.Date
     */	
    public java.util.Date getUpdateTime(){
    	return updateTime;
    }
}