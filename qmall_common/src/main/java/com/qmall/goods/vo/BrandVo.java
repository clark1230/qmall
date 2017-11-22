package com.qmall.goods.vo;

/**
 * 
 * @author xianyaoji
 */
public class BrandVo {
	/**
	 *  品牌编号
	 */
	private Integer brandId;
	/**
	 *  品牌名称
	 */
	private String brandName;
	/**
	 *  
	 */
	private String brandLogo;
	/**
	 *  品牌描述
	 */
	private String brandDesc;
	/**
	 *  品牌的网站
	 */
	private String siteUrl;
	/**
	 *  品牌在前台页面的展示顺序，数字越靠后
	 */
	private Integer sortOrder;
	/**
	 *  是否展示, 0:不展示 1:展示
	 */
	private Integer isShow;
	/**
	 * 品牌编号
	 * @param brandId
	 */
	public void setBrandId(Integer brandId){
		this.brandId = brandId;
	}
	
    /**
     * 品牌编号
     * @return Integer
     */	
    public Integer getBrandId(){
    	return brandId;
    }
	/**
	 * 品牌名称
	 * @param brandName
	 */
	public void setBrandName(String brandName){
		this.brandName = brandName;
	}
	
    /**
     * 品牌名称
     * @return String
     */	
    public String getBrandName(){
    	return brandName;
    }
	/**
	 * 
	 * @param brandLogo
	 */
	public void setBrandLogo(String brandLogo){
		this.brandLogo = brandLogo;
	}
	
    /**
     * 
     * @return String
     */	
    public String getBrandLogo(){
    	return brandLogo;
    }
	/**
	 * 品牌描述
	 * @param brandDesc
	 */
	public void setBrandDesc(String brandDesc){
		this.brandDesc = brandDesc;
	}
	
    /**
     * 品牌描述
     * @return String
     */	
    public String getBrandDesc(){
    	return brandDesc;
    }
	/**
	 * 品牌的网站
	 * @param siteUrl
	 */
	public void setSiteUrl(String siteUrl){
		this.siteUrl = siteUrl;
	}
	
    /**
     * 品牌的网站
     * @return String
     */	
    public String getSiteUrl(){
    	return siteUrl;
    }
	/**
	 * 品牌在前台页面的展示顺序，数字越靠后
	 * @param sortOrder
	 */
	public void setSortOrder(Integer sortOrder){
		this.sortOrder = sortOrder;
	}
	
    /**
     * 品牌在前台页面的展示顺序，数字越靠后
     * @return Integer
     */	
    public Integer getSortOrder(){
    	return sortOrder;
    }
	/**
	 * 是否展示, 0:不展示 1:展示
	 * @param isShow
	 */
	public void setIsShow(Integer isShow){
		this.isShow = isShow;
	}
	
    /**
     * 是否展示, 0:不展示 1:展示
     * @return Integer
     */	
    public Integer getIsShow(){
    	return isShow;
    }
}