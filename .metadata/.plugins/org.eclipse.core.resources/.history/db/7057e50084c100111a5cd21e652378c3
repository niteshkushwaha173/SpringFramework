package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Employee;

public class Main {
public static void main(String[] args) throws ClassNotFoundException 
{
	
	ApplicationContext context=new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
							//context.getBean("emp1", Employee.class)
		Employee emp1=(Employee)context.getBean("emp");
		emp1.display();
}
}
