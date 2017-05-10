package test;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhong.test.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class TestHibernate {
	
	@Resource
	private SessionFactory sessionFactory;
	
	@Test
	public void testHibernate(){
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		User user=(User) session.get(User.class, "1");
		System.out.println(user.getPassword());
	}
	
}
