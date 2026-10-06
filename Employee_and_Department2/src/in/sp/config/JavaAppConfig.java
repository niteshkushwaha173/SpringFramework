package in.sp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import in.sp.beans.Address;
import in.sp.beans.Department;
import in.sp.beans.Employee;
import in.sp.beans.HRDepartment;
import in.sp.beans.ITDepartment;

@Configuration
public class JavaAppConfig {
	@Bean
	public Address empAddress() {
		Address add = new Address();
		add.setHouseno(1234);
		add.setStreet("Mira Road");
		add.setCity("Nalasopara");
		add.setState("Mumbai");
		add.setPincode(274304);
		return add;
	}

	@Bean
	@Primary // bcoz gives priority to ITDepart to reduce ambiguity problem
				// Same Dept name so spring get confuse
	public Department itDepartment() {
		ITDepartment it = new ITDepartment();
		it.setDeptName("developer");
		it.setTechStack("Spring" + " ," + "Spring Boot" + " ," + "Rest");
		it.setProjectCount(12);
		return it;
	}

	@Bean
	public Department hrDept() {
		HRDepartment hr = new HRDepartment();
		hr.setDeptName("Marketing Dept");
		hr.setHrManager("Nit");
		hr.setOpenPositions(5);
		return hr;
	}

	@Bean
	public Employee empDetails(Address address, Department department) {
		Employee emp = new Employee();
		emp.setE_id(1);
		emp.setE_name("Nitesh");
		emp.setSalary(25000);
		emp.setAddress(address);          // Address ka ek hi bean (empAddress) hai, seedha mil jata hai
	    emp.setDepartment(department);
		return emp;
	}
}
