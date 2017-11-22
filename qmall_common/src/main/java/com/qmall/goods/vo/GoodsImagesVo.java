package com.qmall.goods.vo;

/**
 * 
 * @author xianyaoji
 */
public class GoodsImagesVo {
	/**
	 *  图片编号
	 */
	private Integer imageId;
	/**
	 *  商品编号
	 */
	private Integer goodsId;
	/**
	 *  大图路径
	 */
	private String bigImgPath;
	/**
	 *  小图路径
	 */
	private String smallImgPath;
	/**
	 *  是否是封面,0:不是,1:是
	 */
	private Integer isCover;
	/**
	 *  添加人
	 */
	private Integer createBy;
	/**
	 *  添加时间
	 */
	private java.util.Date createTime;
	/**
	 *  修改人
	 */
	private Integer updateBy;
	/**
	 *  修改时间
	 */
	private java.util.Date updateTime;
	/**
	 *  状态,0:禁用,1:启用
	 */
	private Integer status;
	/**
	 * 图片编号
	 * @param imageId
	 */
	public void setImageId(Integer imageId){
		this.imageId = imageId;
	}
	
    /**
     * 图片编号
     * @return Integer
     */	
    public Integer getImageId(){
    	return imageId;
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
	 * 大图路径
	 * @param bigImgPath
	 */
	public void setBigImgPath(String bigImgPath){
		this.bigImgPath = bigImgPath;
	}
	
    /**
     * 大图路径
     * @return String
     */	
    public String getBigImgPath(){
    	return bigImgPath;
    }
	/**
	 * 小图路径
	 * @param smallImgPath
	 */
	public void setSmallImgPath(String smallImgPath){
		this.smallImgPath = smallImgPath;
	}
	
    /**
     * 小图路径
     * @return String
     */	
    public String getSmallImgPath(){
    	return smallImgPath;
    }
	/**
	 * 是否是封面,0:不是,1:是
	 * @param isCover
	 */
	public void setIsCover(Integer isCover){
		this.isCover = isCover;
	}
	
    /**
     * 是否是封面,0:不是,1:是
     * @return Integer
     */	
    public Integer getIsCover(){
    	return isCover;
    }
	/**
	 * 添加人
	 * @param createBy
	 */
	public void setCreateBy(Integer createBy){
		this.createBy = createBy;
	}
	
    /**
     * 添加人
     * @return Integer
     */	
    public Integer getCreateBy(){
    	return createBy;
    }
	/**
	 * 添加时间
	 * @param createTime
	 */
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	
    /**
     * 添加时间
     * @return java.util.Date
     */	
    public java.util.Date getCreateTime(){
    	return createTime;
    }
	/**
	 * 修改人
	 * @param updateBy
	 */
	public void setUpdateBy(Integer updateBy){
		this.updateBy = updateBy;
	}
	
    /**
     * 修改人
     * @return Integer
     */	
    public Integer getUpdateBy(){
    	return updateBy;
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
	/**
	 * 状态,0:禁用,1:启用
	 * @param status
	 */
	public void setStatus(Integer status){
		this.status = status;
	}
	
    /**
     * 状态,0:禁用,1:启用
     * @return Integer
     */	
    public Integer getStatus(){
    	return status;
    }
}