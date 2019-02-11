package employee;

public class Receptionist extends Employee implements Admin{

	public Receptionist(String empID, String empName) {
		super(empID, empName);
		// TODO Auto-generated constructor stub
	}
public int getSalary(int salary) {
		
		int receptionSalary= 45000;
		receptionSalary += salary;
		return receptionSalary;
	}

public void organizePaperWork() {
	implicateEmployee(-20);
	
}
public void tick() {
	implicateEmployee(-5);
	
}
}




