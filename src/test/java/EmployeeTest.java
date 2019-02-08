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
		
		String expected = testIDNum.getEmployeeID("100");
		
		assertEquals(expected, "100");
		
		}
		
	
			
		
		
		
	}

	
	
	
	
	
	


