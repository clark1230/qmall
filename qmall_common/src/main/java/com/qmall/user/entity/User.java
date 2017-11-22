package com.qmall.user.entity;

/**
 * 
 * @author xianyaoji
 */
public class User {
	/**
	 *  用户编号
	 */
	private Integer userId;
	/**
	 *  用户名
	 */
	private String userName;
	/**
	 * 用户编号
	 * @param userId
	 */
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
    /**
     * 用户编号
     * @return
     */	
    public Integer getUserId(){
    	return userId;
    }
	/**
	 * 用户名
	 * @param userName
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
    /**
     * 用户名
     * @return
     */	
    public String getUserName(){
    	return userName;
    }
}