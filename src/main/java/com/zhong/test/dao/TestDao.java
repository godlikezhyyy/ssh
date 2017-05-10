package com.zhong.test.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.zhong.test.pojo.User;

@Repository
public class TestDao {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	
	public User getUser(String id){
		Session session=getSession();
		return (User)session.get(User.class, id);
	}
	
	public void save(User user){
		Session session=getSession();
		session.save(user);
	}
	
}
