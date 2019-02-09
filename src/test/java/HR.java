import java.util.HashMap;

public class HR {

	private HashMap<String, Employee> empTable = new HashMap<String, Employee>();
	
	
	
	
	public void addEmployee(Employee newEmp) {
		empTable.put(newEmp.employeeID(), newEmp);
		
		
		
	}




	public Employee getEmployeeID(String empID) {

		return empTable.get(empID);
		
	}




	public int getNumofEmployees() {
		return empTable.size();
		
	}




	public HashMap<String, Employee> getEmployees() {
		return empTable;
	}

}
