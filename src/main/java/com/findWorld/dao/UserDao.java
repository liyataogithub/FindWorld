package com.findWorld.dao;

import com.findWorld.bean.User;

/** 
 * ���ܸ�Ҫ��User��DAO�� 
 *  
 * @author liyt 
 */  
public interface UserDao {
	
	 /** 
     *  ����ID��ѯUser
     * @author liyt 
     * @param userId 
     * @return 
     */  
    public User selectUserById(Integer userId);  
}
