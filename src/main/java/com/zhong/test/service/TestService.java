package com.zhong.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zhong.test.dao.TestDao;
import com.zhong.test.pojo.User;


@Service
public class TestService {
	
	@Resource
	private TestDao testDao;
	
	public User getUser(String id){
		User user=testDao.getUser(id);
		User user1=new User("2", "12345");
		testDao.save(user1);
		return user;
	}
	
}
