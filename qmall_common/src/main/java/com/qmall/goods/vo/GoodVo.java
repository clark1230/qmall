package com.qmall.goods.vo;

/**
 * 
 * @author xianyaoji
 */
public class GoodVo {
	/**
	 *  商品编号
	 */
	private Integer goodsId;
	/**
	 *  商品所属分类
	 */
	private Integer catId;
	/**
	 *  商品的唯一货号
	 */
	private String goodsCn;
	/**
	 *
	 */
	private String goodsName;
	/**
	 *  商品点击次数
	 */
	private Integer clickCount;
	/**
	 *  品牌编号
	 */
	private Integer brandId;
	/**
	 *  商品库存数量
	 */
	private Integer numberr;
	/**
	 *
	 */
	private java.math.BigDecimal price;
	/**
	 *  商品状态,0:未上架,1:已上架,2:已下架
	 */
	private Integer status;
	/**
	 *  其他属性,存储的是json格式的属性
	 */
	private String otherAttr;
	/**
	 *  商品的缩略图,商品在前天展示的缩略图片
	 */
	private String goodsThumb;
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
	 * 商品所属分类
	 * @param catId
	 */
	public void setCatId(Integer catId){
		this.catId = catId;
	}

	/**
	 * 商品所属分类
	 * @return Integer
	 */
	public Integer getCatId(){
		return catId;
	}
	/**
	 * 商品的唯一货号
	 * @param goodsCn
	 */
	public void setGoodsCn(String goodsCn){
		this.goodsCn = goodsCn;
	}

	/**
	 * 商品的唯一货号
	 * @return String
	 */
	public String getGoodsCn(){
		return goodsCn;
	}
	/**
	 *
	 * @param goodsName
	 */
	public void setGoodsName(String goodsName){
		this.goodsName = goodsName;
	}

	/**
	 *
	 * @return String
	 */
	public String getGoodsName(){
		return goodsName;
	}
	/**
	 * 商品点击次数
	 * @param clickCount
	 */
	public void setClickCount(Integer clickCount){
		this.clickCount = clickCount;
	}

	/**
	 * 商品点击次数
	 * @return Integer
	 */
	public Integer getClickCount(){
		return clickCount;
	}
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
	 * 商品库存数量
	 * @param numberr
	 */
	public void setNumberr(Integer numberr){
		this.numberr = numberr;
	}

	/**
	 * 商品库存数量
	 * @return Integer
	 */
	public Integer getNumberr(){
		return numberr;
	}
	/**
	 *
	 * @param price
	 */
	public void setPrice(java.math.BigDecimal price){
		this.price = price;
	}

	/**
	 *
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getPrice(){
		return price;
	}
	/**
	 * 商品状态,0:未上架,1:已上架,2:已下架
	 * @param status
	 */
	public void setStatus(Integer status){
		this.status = status;
	}

	/**
	 * 商品状态,0:未上架,1:已上架,2:已下架
	 * @return Integer
	 */
	public Integer getStatus(){
		return status;
	}
	/**
	 * 其他属性,存储的是json格式的属性
	 * @param otherAttr
	 */
	public void setOtherAttr(String otherAttr){
		this.otherAttr = otherAttr;
	}

	/**
	 * 其他属性,存储的是json格式的属性
	 * @return String
	 */
	public String getOtherAttr(){
		return otherAttr;
	}
	/**
	 * 商品的缩略图,商品在前天展示的缩略图片
	 * @param goodsThumb
	 */
	public void setGoodsThumb(String goodsThumb){
		this.goodsThumb = goodsThumb;
	}

	/**
	 * 商品的缩略图,商品在前天展示的缩略图片
	 * @return String
	 */
	public String getGoodsThumb(){
		return goodsThumb;
	}
}