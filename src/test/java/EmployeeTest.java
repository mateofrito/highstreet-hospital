import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	@Before
		public void setup() {
		Employee underTest = new Employee("1001", "Jim");
	}
	
	@Test
	
	public void isWorking() {
		Employee underTest = new Employee(true);
		
		
		underTest.toggleIsWorking();
		
		assertEquals(true, underTest.IsWorking());
		
		}
	
	@Test
	
		public void shouldGetEmployeePay() {
			Employee testSalary = new Employee();
			
			int expected = testSalary.getSalary(45000);
			
			assertEquals(expected, 45000);
	}
			
			

	
	@Test
		
		public void shouldaddEmployee() {
		
		HR testTable = new HR();
		Employee newEmp = new Employee("1", "Matt");
		
		int intialEmployees = testTable.getNumofEmployees();
		testTable.addEmployee(newEmp);
		int moreEmployees = testTable.getNumofEmployees();
		
		assertEquals(intialEmployees + 1, moreEmployees);
		
		
	}	
	@Test
		public void shouldaddPatient() {
		
		Census testTable = new Census();
		Patient newPat = new Patient("1", "Adam");
		
		int intialPatients = testTable.getNumofPatients();
		testTable.addPatients(newPat);
		int morePatients = testTable.getNumofPatients();
		
		assertEquals(intialPatients + 1, morePatients);
		
		
		
		}
	
		
		
		
		
		
	}
		
	
	
	
	
	
	
		
		
	

	
	
	
	
	
	


