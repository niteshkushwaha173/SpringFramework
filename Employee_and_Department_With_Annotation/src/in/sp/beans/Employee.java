package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("1")
	private int e_id;
	@Value("Nitesh")
	private String e_name;
	@Value("25000")
	private double salary;

	//Autowiring both Class 
	@Autowired
	private Address address;
	@Autowired
	private Department department; // 2 beans, @Primary wala (IT) milega

	public void display() {
		System.out.println("Id         :: " + e_id);
		System.out.println("Name       :: " + e_name);
		System.out.println("Salary     :: " + salary);
		System.out.println("Department :: " + department.getDeptDetails());
		System.out.println("Address    :: " + address);
	}
}
