
public class Employee {

		private String empName;
		private String empID;
		private boolean isWorking;
		private int salary;
		private int bloodBank;
		
		
		
		
	public Employee(String empID, String empName) {
		this.empName = empName;
		this.empID = empID;
		this.salary = 0;
		this.bloodBank = 100;
		
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

	public String employeeID() {

		return empID;
	}
	
	public String employeeName() {
		return empName;
	}

	public int drawBlood(int blooddraw){
	//	this.bloodBank = bloodBank;
		this.bloodBank += blooddraw;
		
		return bloodBank;
		
		// TODO Auto-generated method stub
		
	}
	}
