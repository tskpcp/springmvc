package aop.Impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.aopImpl.xml");
		
		ArithmeticCalculator target=ac.getBean(ArithmeticCalculator.class);
		
		int result=target.add(3,6);
		System.out.println("result:"+result);
		
		result=target.div(12,6);
		System.out.println("result:"+result);
		
	}

}
