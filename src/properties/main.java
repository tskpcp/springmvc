package properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class main {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.properties.xml");
		DataSource ds=(DataSource)ac.getBean("dataSource");
		System.out.println(ds.getConnection());
		
	}

}
