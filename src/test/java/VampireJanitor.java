
public class VampireJanitor extends Employee {

	public VampireJanitor(String empID, String name) {
		super(empID, name);
		
		// TODO Auto-generated constructor stub
	}
	
public int getSalary(int salary) {
		
		int vamJanSalary= 40000;
		vamJanSalary += salary;
		return vamJanSalary;
	}

}
