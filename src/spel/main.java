package spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.spel.xml");
		
		Address a=(Address)ac.getBean("address");
		System.out.println(a);
		
		Car c=(Car)ac.getBean("car");
		System.out.println(c);
		
		Parson p=(Parson)ac.getBean("parson");
		System.out.println(p);
	}

}
