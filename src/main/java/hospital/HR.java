package hospital;
import java.util.HashMap;

import employee.Employee;

public class HR {

	private HashMap<String, Employee> empTable = new HashMap<String, Employee>();
	
	
	public Employee getEmployeeID(String empID) {
		return empTable.get(empID);
		
	}
	
	public HashMap<String, Employee> getEmployees() {
		return empTable;
	}
	
	public int getNumofEmployees() {
		return empTable.size();
		
	}
	public void addEmployee(Employee newEmp) {
		empTable.put(newEmp.employeeID(), newEmp);
		
	}





}
