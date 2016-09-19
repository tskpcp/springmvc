package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowire.Car;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.scope.xml");
		Car c=(Car)ac.getBean("car");
		Car c1=(Car)ac.getBean("car");
		System.out.println(c==c1);
	}

}
