package cyele;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans.cyele.xml");
		
		
		Car c=(Car)ac.getBean("car");
		System.out.println(c);
		
		//¹Ø±Õ
		ac.close();

	}

}
