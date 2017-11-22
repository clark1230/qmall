package com.qmall.goods.vo;

/**
 * 
 * @author xianyaoji
 */
public class CollectGoodVo {
	/**
	 *  收藏编号
	 */
	private Integer colId;
	/**
	 *  客户编号
	 */
	private Integer userId;
	/**
	 *  客户名称,采用冗余设计
	 */
	private String userName;
	/**
	 *  商品编号
	 */
	private Integer goodsId;
	/**
	 *  
	 */
	private String goodsThumb;
	/**
	 *  收藏时间
	 */
	private java.util.Date colTime;
	/**
	 *  是否关注,0；不关注,1:关注
	 */
	private Integer isAttention;
	/**
	 * 收藏编号
	 * @param colId
	 */
	public void setColId(Integer colId){
		this.colId = colId;
	}
	
    /**
     * 收藏编号
     * @return Integer
     */	
    public Integer getColId(){
    	return colId;
    }
	/**
	 * 客户编号
	 * @param userId
	 */
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
    /**
     * 客户编号
     * @return Integer
     */	
    public Integer getUserId(){
    	return userId;
    }
	/**
	 * 客户名称,采用冗余设计
	 * @param userName
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
    /**
     * 客户名称,采用冗余设计
     * @return String
     */	
    public String getUserName(){
    	return userName;
    }
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
	 * 
	 * @param goodsThumb
	 */
	public void setGoodsThumb(String goodsThumb){
		this.goodsThumb = goodsThumb;
	}
	
    /**
     * 
     * @return String
     */	
    public String getGoodsThumb(){
    	return goodsThumb;
    }
	/**
	 * 收藏时间
	 * @param colTime
	 */
	public void setColTime(java.util.Date colTime){
		this.colTime = colTime;
	}
	
    /**
     * 收藏时间
     * @return java.util.Date
     */	
    public java.util.Date getColTime(){
    	return colTime;
    }
	/**
	 * 是否关注,0；不关注,1:关注
	 * @param isAttention
	 */
	public void setIsAttention(Integer isAttention){
		this.isAttention = isAttention;
	}
	
    /**
     * 是否关注,0；不关注,1:关注
     * @return Integer
     */	
    public Integer getIsAttention(){
    	return isAttention;
    }
}