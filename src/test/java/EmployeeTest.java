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
	
		public void shouldHaveEmployeeID() {
		Employee testIDNum = new Employee();
		
		String employeeID = "100";
		
		String expected = testIDNum.employeeID(employeeID);
		
		assertEquals(expected, "100");
		
		}
		
	
	@Test
		
		public void addEmployee() {
		
		HR testTable = new HR();
		Employee newEmp = new Employee("1", "Matt");
		
		testTable.addEmployee(newEmp);
		Employee didItWork = testTable.getEmployeeID("1");
		
		assertEquals(newEmp, didItWork);
		
		
		
		
		
		
		
		
		
	}
		
	
	
	
	
	
	
		
		
	}

	
	
	
	
	
	


