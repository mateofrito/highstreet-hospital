
public class Surgeon extends Doctor {

	public Surgeon(String empID, String empName) {
		super(empID, empName);
		// TODO Auto-generated constructor stub
	}


public int getSalary(int salary) {
		
		int surgeonSalary= 120000;
		surgeonSalary += salary;
		return surgeonSalary;
	}

}
