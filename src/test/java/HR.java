import java.util.HashMap;

public class HR {

	private HashMap<String, Employee> empTable = new Hashmap<String, Employee>();
	
	
	
	
	public void addEmployee(Employee newEmp) {
		empTable.put(newEmp.getEmployeeID(), newEmp);
		
		
		
	}




	public Employee getEmployeeID(String empID) {

		return empTable.get(empID);
		
	}

}
