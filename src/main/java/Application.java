import java.util.Scanner;

public class Application{

	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		
        System.out.println("*************************************************");
		System.out.println("                The Implication                    ");
		System.out.println("            At High Street Hospital               ");
		System.out.println("               A Tom Clancy Game                  ");
		System.out.println("*************************************************");
		
		
		
		
		
		
		
		System.out.println("Press Enter to Begin!");
		input.nextLine();
		
		
		System.out.println("Welcome new We Can Code IT grad to the High Street Hospital");
		System.out.println("I know Carol from HR and Lacey, your Career Services Advisor told you");
		System.out.println("this was going to be a developer position...  But they deceived you.");
		
		input.nextLine();
		
		System.out.println("I am your supreme overlord the <Vampire Janitor>, Dennis");
		System.out.println("If anyone asks, you are the Hospital Administrator");
		System.out.println("Your objective is to direct all hospital employees to treat");
		System.out.println("the patients, but also draw blood so I can eat.");
		
		input.nextLine();
		
		System.out.println("If a patient dies, staff members will be implicated...");
		System.out.println("In short...  It's all about the implication");
		
		System.out.println("Let's go over how to make people do stuff");
		input.nextLine();
		
		System.out.println("*********************Main Menu*******************");
		System.out.println("              1.  View Hopsital Roster");
		System.out.println("              2.  View Patient Census ");
		System.out.println("              3.  Interact with Patients");
		System.out.println("              4.  Quit");
		
		System.out.println("*************************************************");
		
		
		int userOption = input.nextInt();
		//Main Menu
		while(userOption != 5){
			HR hospitalRoster = new HR();
			hospitalRoster.addEmployee(new Janitor("500", "Richard Cranium"));
			hospitalRoster.addEmployee(new Receptionist("400", "Tits McGee"));
			hospitalRoster.addEmployee(new Nurse("300", "Alaska Later"));
			hospitalRoster.addEmployee(new Surgeon("200", "Doctor Nick"));
			hospitalRoster.addEmployee(new Doctor("100", "The Doctor"));
			hospitalRoster.addEmployee(new VampireJanitor("666", "Dennis"));
			
			Census patientCensus = new Census();
			
			patientCensus.addPatients(new Patient("2000", "Jim Halpert"));
			patientCensus.addPatients(new Patient("2001", "Pam Halpert"));
			patientCensus.addPatients(new Patient("2003", "Jack Ryan"));
			patientCensus.addPatients(new Patient("2004", "Tom Brokaw"));
			
			//Hospital Roster
			if(userOption == 1) {
				System.out.println("Here is your Roster");
				System.out.println("***********High Street Hospital HR Menu************");
				System.out.println("");
				System.out.println("ID  Job Title          Name          Salary");
				for (Employee employees : hospitalRoster.getEmployees().values())
				{
					String jobTitle = "job";
					if(employees instanceof Janitor)
					{ jobTitle = "Janitor          ";
					
					}else if (employees instanceof Receptionist)
					{ jobTitle = "Receptionist     ";
					}else if (employees instanceof Nurse)
					{ jobTitle = "Nurse            ";
					} else if (employees instanceof Surgeon)
					{ jobTitle = "Surgeon          ";
					} else if (employees instanceof Doctor)
					{ jobTitle = "Doctor           ";
					} else if (employees instanceof VampireJanitor) {
					  jobTitle = "Vampire Janitor  ";
					}
					
					System.out.println(employees.employeeID() + " " + jobTitle + "  " + employees.employeeName() + "   " + employees.getSalary(0));
					
					
				
				}
				
				System.out.println("***************************************************");
				break;
			}else if (userOption == 2) //Patient Census
				{
				System.out.println("********High Street Hospital Patient Census********");
				System.out.println(" ");
				System.out.println(" ID   Name        Blood  Health");
				for (Patient patients : patientCensus.getPatients().values())
				{
					System.out.println(patients.patientID() + " " + patients.patientName() + "   " + patients.getBloodLevel() + "   " + patients.getHealthPoints());
				}
				
				System.out.println("***************************************************");
			
				break;
			}else if (userOption == 3) //Interact with Patients
			{
				
			}else if (userOption == 4) //Quit
			{
				
			}
				
		}		
				
				
				
				
				
				
				
			
			
			
		}
		
		
		
		
		
		
		
		

	

}
