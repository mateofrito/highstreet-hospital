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

public void drawBlood(int blood) {
	int bloodBank = super.getBloodBank();
	bloodBank += blood;
	
	
	
	// TODO Auto-generated method stub
	
}






}
