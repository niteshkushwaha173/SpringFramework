package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Employee;
import in.sp.config.JavaAppConfig;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaAppConfig.class);
		Employee emp = context.getBean( Employee.class); // bean id = method ka naam
		emp.display();
	}
}
