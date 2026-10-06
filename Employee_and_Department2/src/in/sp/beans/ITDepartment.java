package in.sp.beans;

public class ITDepartment implements Department {
	private String deptName;
	private String techStack;
	private int projectCount;
	
	public ITDepartment() { }
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}

	public void setProjectCount(int projectCount) {
		this.projectCount = projectCount;
	}

	@Override
	public String getDeptDetails() {
		return deptName + " | Tech: " + techStack + " | Projects: " + projectCount;

	}

}
