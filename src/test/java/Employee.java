
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
		
		
		public int getBloodBank() {
			return bloodBank;
		}
		
		public String employeeID() {
			
			return empID;
		}

		public String employeeName() {
			return empName;
		}

	public int getSalary(int salary) {
		this.salary = salary;
		return salary;
	}

	
	

	public int drawBlood(int blooddraw){
		this.bloodBank += blooddraw;
		return blooddraw;
	
		
		
		// TODO Auto-generated method stub
		
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
}