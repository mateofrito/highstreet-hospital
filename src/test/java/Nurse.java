
public class Nurse extends Employee implements Admin, DrawBlood {

	public Nurse(String empID, String empName) {
		super(empID, empName);
		// TODO Auto-generated constructor stub
	}
public int getSalary(int salary) {
		
		int rnSalary= 50000;
		rnSalary += salary;
		return rnSalary;
	}
public void feedPatient() {
	implicateEmployee(-15);
	// TODO Auto-generated method stub
	
}

public void organizePaperWork() {
	implicateEmployee(-20);
	
}
public void drawBlood(int blood) {
	changeBloodBank(blood);
	
	
	// TODO Auto-generated method stub
	
}

}
