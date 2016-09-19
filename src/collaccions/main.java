package collaccions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Parson p=(Parson)ac.getBean("parson2");
		System.out.println(p);
		
		p=(Parson)ac.getBean("parson4");
		System.out.println(p);
		
		p=(Parson)ac.getBean("parson5");
		System.out.println(p);
		
		NewParson np=(NewParson)ac.getBean("newParson");
		System.out.println(np);
		
		DataSource ds=ac.getBean(DataSource.class);
		System.out.println(ds.getProperties());
	}

}
