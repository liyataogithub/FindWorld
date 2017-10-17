package com.findWorld.service;


import com.findWorld.bean.User;

/** 
 * 功能概要：UserService接口类 
 *  
 * @author liyt 
 */  
public interface UserService {
	
	/** 
     *  根据ID查询User
     * @author liyt 
     * @param userId 
     * @return 
     */ 
	 User selectUserById(Integer userId);  
}
