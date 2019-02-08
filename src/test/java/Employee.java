
public class Employee {

		private String empName;
		private String empID;
		private boolean isWorking;
		private int salary;
		
		
		
		
		
	public Employee(String empID, String empName) {
		
		
	}

	public Employee(boolean isWorking) {
		
	}
	
	

	public Employee() {
		
	}

	public void toggleIsWorking() {
		isWorking = !isWorking;
		
		
	}

	public Object IsWorking() {
		return isWorking;
		
	}

	public int getSalary(int salary) {
		this.salary = salary;
		return salary;
	}

	public String getEmployeeID() {
		
		return empID;
	}

	
}
