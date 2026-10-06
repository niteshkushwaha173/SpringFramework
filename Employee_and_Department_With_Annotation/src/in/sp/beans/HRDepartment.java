package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HRDepartment implements Department {
	@Value("Marketing")
	private String deptName;
	@Value("Nit Kumar")
	private String hrManager;
	@Value("5")
	private int openPositions;

	public String getDeptDetails() {
		return "| DeptName" + deptName + "| HRManager" + hrManager + "| OpenPositions" + openPositions;

	}

}
