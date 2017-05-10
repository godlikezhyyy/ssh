package com.zhong.test.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.zhong.test.pojo.User;
import com.zhong.test.service.TestService;

@Controller
public class Test extends ActionSupport{

	@Resource
	private TestService testService;
	
	private User user;
	
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String execute() throws Exception {
		
		user =testService.getUser("1");
		return SUCCESS;
	}

	
}
