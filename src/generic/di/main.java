package generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.generic.di.xml");
		
	    UserService userService=(UserService)ac.getBean("userService");
	    userService.add();
	}

}
