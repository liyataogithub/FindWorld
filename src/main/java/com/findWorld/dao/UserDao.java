package com.findWorld.dao;

import com.findWorld.bean.User;

/** 
 * 功能概要：User的DAO类 
 *  
 * @author liyt 
 */  
public interface UserDao {
	
	 /** 
     *  根据ID查询User
     * @author liyt 
     * @param userId 
     * @return 
     */  
    public User selectUserById(Integer userId);  
}
