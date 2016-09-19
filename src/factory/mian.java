package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.factory.xml");
		Car c=(Car)ac.getBean("car1");
		System.out.println(c);
		
		Car c1=(Car)ac.getBean("car2");
		System.out.println(c1);
		
	}

}
