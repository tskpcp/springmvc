package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HelloWord hw=new HelloWord();
		//hw.setName("sadasdasd");
		//1\����Spring��ioc��������
		//Application����IOC����
		//ClassPathXmlApplicationContext
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloWord hw=(HelloWord)ac.getBean("hellWord");
		
		System.out.println(hw);
//		hw.hello();
		
		Car c=(Car)ac.getBean("car1");
		System.out.println(c);
		
		c=(Car)ac.getBean("car2");
		System.out.println(c);
		
		Parson p=(Parson)ac.getBean("parson");
		System.out.println(p);
		
		p=(Parson)ac.getBean("parson1");
		System.out.println(p);
	}

}
