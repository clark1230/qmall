package com.qmall.goods.vo;

/**
 * 
 * @author xianyaoji
 */
public class GoodsCategoryVo {
	/**
	 *  
	 */
	private Integer categoryId;
	/**
	 *  父级类目编号，如果为0时，表示的是一级的类目
	 */
	private Integer parentId;
	/**
	 *  类目名称
	 */
	private String name;
	/**
	 *  状态, 可选  1:正常  2:删除  默认为正常
	 */
	private Integer status;
	/**
	 *  排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
	 */
	private Integer sortOrder;
	/**
	 *  该类目是否为父类目，1为true，0为false
	 */
	private Byte isParent;
	/**
	 *  
	 */
	private java.util.Date createTime;
	/**
	 *  
	 */
	private java.util.Date updateTime;
	/**
	 * 
	 * @param categoryId
	 */
	public void setCategoryId(Integer categoryId){
		this.categoryId = categoryId;
	}
	
    /**
     * 
     * @return Integer
     */	
    public Integer getCategoryId(){
    	return categoryId;
    }
	/**
	 * 父级类目编号，如果为0时，表示的是一级的类目
	 * @param parentId
	 */
	public void setParentId(Integer parentId){
		this.parentId = parentId;
	}
	
    /**
     * 父级类目编号，如果为0时，表示的是一级的类目
     * @return Integer
     */	
    public Integer getParentId(){
    	return parentId;
    }
	/**
	 * 类目名称
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}
	
    /**
     * 类目名称
     * @return String
     */	
    public String getName(){
    	return name;
    }
	/**
	 * 状态, 可选  1:正常  2:删除  默认为正常
	 * @param status
	 */
	public void setStatus(Integer status){
		this.status = status;
	}
	
    /**
     * 状态, 可选  1:正常  2:删除  默认为正常
     * @return Integer
     */	
    public Integer getStatus(){
    	return status;
    }
	/**
	 * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
	 * @param sortOrder
	 */
	public void setSortOrder(Integer sortOrder){
		this.sortOrder = sortOrder;
	}
	
    /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     * @return Integer
     */	
    public Integer getSortOrder(){
    	return sortOrder;
    }
	/**
	 * 该类目是否为父类目，1为true，0为false
	 * @param isParent
	 */
	public void setIsParent(Byte isParent){
		this.isParent = isParent;
	}
	
    /**
     * 该类目是否为父类目，1为true，0为false
     * @return Byte
     */	
    public Byte getIsParent(){
    	return isParent;
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
	 * 
	 * @param updateTime
	 */
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
	
    /**
     * 
     * @return java.util.Date
     */	
    public java.util.Date getUpdateTime(){
    	return updateTime;
    }
}