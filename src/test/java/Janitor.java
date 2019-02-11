
public class Janitor extends Employee {
	
	

	public Janitor(String empID, String name) {
		super(empID, name);
		// TODO Auto-generated constructor stub
	}
public int getSalary(int salary) {
		
		int janitorSalary= 40000;
		janitorSalary += salary;
		return janitorSalary;
	}
	

}
