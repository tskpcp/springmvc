package relection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowire.Address;
import autowire.Parson;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("releation.xml");
		Address a=(Address)ac.getBean("address1");
		System.out.println(a);
		
		 a=(Address)ac.getBean("address2");
			System.out.println(a);
			
		Parson p=(Parson)ac.getBean("pareson");
		System.out.println(p);
	}

}
