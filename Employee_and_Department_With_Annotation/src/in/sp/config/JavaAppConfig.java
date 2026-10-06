package in.sp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import in.sp.beans.Address;
import in.sp.beans.Department;
import in.sp.beans.Employee;
import in.sp.beans.HRDepartment;
import in.sp.beans.ITDepartment;

@Configuration
@ComponentScan("in.sp.beans")
public class JavaAppConfig {
}
