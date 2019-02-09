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
	
	@Test
	
	public void shouldaddDoctor() {
		HR testTable = new HR();
		
		Employee newEmp = new Doctor("100", "Gary Shandling");
		
		int intialEmployees = testTable.getNumofEmployees();
		testTable.addEmployee(newEmp);
		int moreEmployees = testTable.getNumofEmployees();
		
		assertEquals(intialEmployees + 1, moreEmployees);
		
	}
	
	
	@Test
	public void shouldaddSurgeon() {
		HR testTable = new HR();
		
		Employee newEmp = new Surgeon("100", "Gary Shandling");
		
		int intialEmployees = testTable.getNumofEmployees();
		testTable.addEmployee(newEmp);
		int moreEmployees = testTable.getNumofEmployees();
		
		assertEquals(intialEmployees + 1, moreEmployees);
	}
	@Test
	public void shouldaddNurse() {
		HR testTable = new HR();
		
		Employee newEmp = new Nurse("100", "Gary Shandling");
		
		int intialEmployees = testTable.getNumofEmployees();
		testTable.addEmployee(newEmp);
		int moreEmployees = testTable.getNumofEmployees();
		
		assertEquals(intialEmployees + 1, moreEmployees);
	}
		
	@Test
	public void shouldaddReceptionist() {
		HR testTable = new HR();
		
		Employee newEmp = new Receptionist("100", "Gary Shandling");
		
		int intialEmployees = testTable.getNumofEmployees();
		testTable.addEmployee(newEmp);
		int moreEmployees = testTable.getNumofEmployees();
		
		assertEquals(intialEmployees + 1, moreEmployees);
	}	
		
	@Test
	public void shouldaddJanitor() {
		HR testTable = new HR();
		
		Employee newEmp = new Janitor("100", "Gary Shandling");
		
		int intialEmployees = testTable.getNumofEmployees();
		testTable.addEmployee(newEmp);
		int moreEmployees = testTable.getNumofEmployees();
		
		assertEquals(intialEmployees + 1, moreEmployees);
	}	
	@Test
	public void shouldaddVampireJanitor() {
		HR testTable = new HR();
		
		Employee newEmp = new VampireJanitor("100", "Gary Shandling");
		
		int intialEmployees = testTable.getNumofEmployees();
		testTable.addEmployee(newEmp);
		int moreEmployees = testTable.getNumofEmployees();
		
		assertEquals(intialEmployees + 1, moreEmployees);
	}	
	
	@Test
	public void shouldListEmployeeInformation() {
		
		HR testTable = new HR();
		
		testTable.addEmployee(new Janitor("500", "Richard Cranium"));
		testTable.addEmployee(new Receptionist("400", "Tits McGee"));
		testTable.addEmployee(new Nurse("300", "Alaska Later"));
		testTable.addEmployee(new Surgeon("200", "Doctor Nick"));
		testTable.addEmployee(new Doctor("100", "The Doctor"));
		testTable.addEmployee(new VampireJanitor("666", "Bob Dracula"));
		
		
		for (Employee employees : testTable.getEmployees().values())
		{
			String jobTitle = "job";
			if(employees instanceof Janitor)
			{ jobTitle = "Janitor       ";
			
			}else if (employees instanceof Receptionist)
			{ jobTitle = "Receptionist   ";
			}
			else if (employees instanceof Nurse)
			{ jobTitle = "Nurse          ";
			} else if (employees instanceof Surgeon)
			{ jobTitle = "Surgeon        ";
			} else if (employees instanceof Doctor)
			{ jobTitle = "Doctor          ";
			} else if (employees instanceof VampireJanitor) {
			 jobTitle = "Vampire Janitor ";
			}
			System.out.println(employees.employeeID()+ " " + jobTitle + employees.getSalary(0));
			
			
		
		}
		
		
		
	}
	
	
	
	
	
	
	
	}
		
	
	
	
	
	
	
		
		
	

	
	
	
	
	
	


