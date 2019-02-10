
public class Doctor extends Employee {

	public Doctor(String empID, String empName) {
		super(empID, empName);
	}
	
	
	public int getSalary(int salary) {
		
		int docSalary= 90000;
		docSalary += salary;
		return docSalary;
	}
	
	public int getImplication() {
		int implication =  super.getImplication();
		 
		 return implication;
	 }
	
	public void performTreatment() {
		implicateEmployee(-10);
		
		
	}


	

}
