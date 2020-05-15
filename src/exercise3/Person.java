package exercise3;

public class Person {

	private Department department;

	public void setDepartment(Department arg) {
		department = arg;
	}

	public Person getManager() {
		return department.getManager();
	}

}
