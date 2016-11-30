package com.virtusa.spring.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.virtusa.spring.cointainer.UserBean;
import com.virtusa.spring.cointainer.Welcome;

@SuppressWarnings("deprecation")
public class WelcomeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resorce = new ClassPathResource("myapplicationconfig.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resorce);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"myapplicationconfig.xml");
		// Welcome welcome = beanFactory.getBean("wBean",Welcome.class);
		Welcome welcome = (Welcome) beanFactory.getBean("wBean");
		welcome.greet();
		UserBean userBean = (UserBean) beanFactory.getBean("uBean");
		System.out.println(userBean);
		Constrtest userBean1 = (Constrtest) beanFactory.getBean("constructor");
		System.out.println(userBean1);
	}
}
