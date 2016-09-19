package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.controller.UserController;
import annotation.repository.UserRepository;
import annotation.service.UserService;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.annotation.xml");
		
//		TestObject testObject=(TestObject)ac.getBean("testObject");
//		System.out.println(testObject);
//		
		UserController userController=(UserController)ac.getBean("userController");
		System.out.println(userController);
		userController.execute();
//		
//		UserService userService=(UserService)ac.getBean("userService");
//		System.out.println(userService);
//		
//		UserRepository userRepository=(UserRepository)ac.getBean("userRepository");
//		System.out.println(userRepository);
		
	}

}
