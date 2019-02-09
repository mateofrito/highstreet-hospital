
public class Doctor extends Employee {

	public Doctor(String empID, String empName) {
		// TODO Auto-generated constructor stub
	}
	
	
	public int getSalary(int salary) {
		
		int docSalary= 90000;
		docSalary += salary;
		return docSalary;
	}

}
