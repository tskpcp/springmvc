package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowire.Parson;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beansAutowire.xml");
		Parson p=(Parson)ac.getBean("parson");
		System.out.println(p);
		
		p=(Parson)ac.getBean("parsonName");
		System.out.println(p);
		
		p=(Parson)ac.getBean("parsonType");
		System.out.println(p);
	}

}
