package com.findWorld.service;


import com.findWorld.bean.User;

/** 
 * ���ܸ�Ҫ��UserService�ӿ��� 
 *  
 * @author liyt 
 */  
public interface UserService {
	
	/** 
     *  ����ID��ѯUser
     * @author liyt 
     * @param userId 
     * @return 
     */ 
	 User selectUserById(Integer userId);  
}
