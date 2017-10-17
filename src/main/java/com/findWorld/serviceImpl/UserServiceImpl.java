package com.findWorld.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findWorld.bean.User;
import com.findWorld.dao.UserDao;
import com.findWorld.service.UserService;
/** 
 * ���ܸ�Ҫ��UserServiceʵ���� 
 *  
 * @author liyt 
 */  
@Service  
public class UserServiceImpl implements UserService  {
	@Autowired  
    private UserDao userDao;

	/** 
     *  ����ID��ѯUser
     * @author liyt 
     * @param userId 
     * @return 
     */ 
	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId); 
	}  
	
	
}