package employee;

public class VampireJanitor extends Janitor implements DrawBlood{

	public VampireJanitor(String empID, String name) {
		super(empID, name);
		
		// TODO Auto-generated constructor stub
	}
	
public int getSalary(int salary) {
		
		int vamJanSalary= 40000;
		vamJanSalary += salary;
		return vamJanSalary;
	}

public int drawBlood(int blood) {
	int bloodBank = super.getBloodBank();
	bloodBank += blood;
	
	return bloodBank;
	
	// TODO Auto-generated method stub
	
}






}
