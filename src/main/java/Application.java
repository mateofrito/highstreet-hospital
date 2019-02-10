import java.util.Scanner;

public class Application implements patientInteraction{

	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
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
		boolean gameIsOn = true;
		while(gameIsOn) {
			mainMenu(input, hospitalRoster, patientCensus);//close userOption switch		
			}
		
		}//close class application

	private static void mainMenu(Scanner input, HR hospitalRoster, Census patientCensus) {
		System.out.println("*********************Main Menu*******************");
		System.out.println("              1.  View Hopsital Roster");
		System.out.println("              2.  View Patient Census ");
		System.out.println("              3.  Interact with Patients");
		System.out.println("              4.  Quit");
		
		System.out.println("*************************************************");
		System.out.println("Select an option.");
		
		int userOption = input.nextInt() ;
		
		//Main Menu
		
			
			//Hospital Roster
			switch(userOption) {
			case 1: //hospital roster
				employeeRoster(hospitalRoster);
				break;
			case 2: //Patient Census
				
				patientCensus(patientCensus);
			
				break;
				
			case 3:  //Interact with Patients
				patientInteraction(input, hospitalRoster, patientCensus);
				
				//close actionOption switch
				
				break;
				//close userOption 3
			case 4:  //Quit
					System.out.println("Too much for ya?  You are not worthy of THE GOLDEN GOD!");
					System.exit(0);
				
			//close userOption4
			
		}
	}

	private static void patientCensus(Census patientCensus) {
		System.out.println("********High Street Hospital Patient Census********");
		System.out.println(" ");
		System.out.println(" ID   Name        Blood  Health");
		for (Patient patients : patientCensus.getPatients().values())
		{
			System.out.println(patients.patientID() + " " + patients.patientName() + "   " + patients.getBloodLevel() + "   " + patients.getHealthPoints());
		}
		
		System.out.println("***************************************************");
	}

	private static void employeeRoster(HR hospitalRoster) {
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
	}

	private static void patientInteraction(Scanner input, HR hospitalRoster, Census patientCensus) {
		boolean interaction = true;
		while (interaction) {
		System.out.println("*********************Action Menu******************");
		System.out.println("              1.  Draw Blood");
		System.out.println("              2.  Give Blood to Dennis ");
		System.out.println("              3.  Treat Patients");
		System.out.println("              4.  Perform Surgury");
		System.out.println("              5.  Feed Patient");
		System.out.println("              6.  Answer Phone");
		System.out.println("              7.  Organize Papers");
		System.out.println("              8.  Sweep the floor");
		System.out.println("              10.  Main Menu");
		System.out.println("*************************************************");
		
		System.out.println("Select number of action you wish to complete");
		int actionOption = input.nextInt();

		switch (actionOption) {
			case 1:
				System.out.println("Time to draw some blood!");
				patientCensus(patientCensus);
				System.out.println("Enter the ID of the patient that you will draw blood from");
				String bloodVictim = input.next();
				

				System.out.println("***********High Street Hospital HR Menu************");
				System.out.println("");
				System.out.println("ID  Job Title          Name          Implication");
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
					
					if(employees instanceof Doctor || employees instanceof Nurse || employees instanceof VampireJanitor) {
			
					System.out.println(employees.employeeID() + " " + jobTitle + "  " + employees.employeeName() + "   " + employees.getImplication());
					}
					
				
				}
				System.out.println("***************************************************");
				
				
				
				System.out.println("Enter ID of who is drawing the blood");
				String bloodDrawer = input.next();
				
				Patient blooddrawn = patientCensus.getPatientID(bloodVictim);
				Employee bloodtaker = hospitalRoster.getEmployeeID(bloodDrawer);
				
				int bloodunits = 10;
				
				((DrawBlood)bloodtaker).drawBlood(bloodunits);
				blooddrawn.drawBlood(bloodunits);
				
				System.out.println("***************************************************");
				System.out.println(bloodtaker.employeeName() + " "  + "blood bank changed to " + bloodtaker.getBloodBank());
				System.out.println(blooddrawn.patientName() + " " + " blood level changed to " + blooddrawn.getBloodLevel());
				System.out.println("***************************************************");
				
				
				break;
				
				
			
			case 3:
			patientCensus(patientCensus);
				System.out.println("Enter the ID number of the patient needing treatment.");
				String patientTreat = input.next();
				
				System.out.println("***********High Street Hospital HR Menu************");
				System.out.println("");
				System.out.println("ID  Job Title          Name          Implication");
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
					
					if(employees instanceof Doctor) {
					System.out.println(employees.employeeID() + " " + jobTitle + "  " + employees.employeeName() + "   " + employees.getImplication());
					}
					
				
				}
				System.out.println("***************************************************");
				System.out.println("Select the ID of the Doctor performing treatment");
				String doctorTreat = input.next();
				
				Patient victim = patientCensus.getPatientID(patientTreat);
				Employee doctor = hospitalRoster.getEmployeeID(doctorTreat);
				
				((Doctor)doctor).performTreatment();
				victim.receiveTreatment();
				
				System.out.println("***************************************************");
				System.out.println(doctor.employeeName() + " "  + "implication changed to " + doctor.getImplication());
				System.out.println(victim.patientName() + " " + " health changed to " + victim.getHealthPoints());
				System.out.println("***************************************************");
			
				
				break;
			//close actionOption 3
			case 5: //feed option

			patientCensus(patientCensus);
				System.out.println("Enter the ID number of the patient needing fed.");
				 patientTreat = input.next();
				
				System.out.println("***********High Street Hospital HR Menu************");
				System.out.println("");
				System.out.println("ID  Job Title          Name          Implication");
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
					
					if(employees instanceof Nurse) {
					System.out.println(employees.employeeID() + " " + jobTitle + "  " + employees.employeeName() + "   " + employees.getImplication());
					}
					
				
				}
				System.out.println("***************************************************");
				System.out.println("Select the ID of the nurse feeding the patient");
				String nurseTreat = input.next();
				
				 victim = patientCensus.getPatientID(patientTreat);
				Employee nurse = hospitalRoster.getEmployeeID(nurseTreat);
				
				((Nurse)nurse).feedPatient();
				victim.receiveFood();
				
				System.out.println("***************************************************");
				System.out.println(nurse.employeeName() + " "  + "implication changed to " + nurse.getImplication());
				System.out.println(victim.patientName() + " " + " health changed to " + victim.getHealthPoints());
				System.out.println("***************************************************");
				
				
				
				
				
				
				
				
				break;
				//end case 5
			case 6: //on the phones
				System.out.println("***********High Street Hospital HR Menu************");
				System.out.println("");
				System.out.println("ID  Job Title          Name          Implication");
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
					
					if(employees instanceof Receptionist) {
					System.out.println(employees.employeeID() + " " + jobTitle + "  " + employees.employeeName() + "   " + employees.getImplication());
					}
					
				
				}
				System.out.println("***************************************************");
				System.out.println("Select the ID of the person to be on the phones.");
				String receptionPhone = input.next();
				
				Employee receptionist = hospitalRoster.getEmployeeID(receptionPhone);
				
				if (receptionist.IsWorking()) {
					System.out.println("They are already sweeping the floors");
				} else {
					receptionist.toggleWorking();
				System.out.println("The receptionist is now on the phone!");
				System.out.println("This will make people think we are a legitimate hosptial.");
				}
				
				
					
			break;
				
			//close actionOption 6 - feed
			case 7: 
				System.out.println("Probably a good idea to take care of the paperwork,");
				System.out.println("because of the implication...");
				
				System.out.println("***********High Street Hospital HR Menu************");
				System.out.println("");
				System.out.println("ID  Job Title          Name          Implication");
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
					
					if(employees instanceof Receptionist || employees instanceof Nurse) {
					System.out.println(employees.employeeID() + " " + jobTitle + "  " + employees.employeeName() + "   " + employees.getImplication());
					}
					
				
				}
				System.out.println("***************************************************");
				System.out.println("Select the ID of the person who needs to 'do paperwork'.");
				String paperWork = input.next();
				
				Employee admin = hospitalRoster.getEmployeeID(paperWork);
				
				((Admin)admin).organizePaperWork();
				
				System.out.println("***************************************************");
				System.out.println(admin.employeeName() + " "  + "implication changed to " + admin.getImplication());
				
				System.out.println("***************************************************");
				
				
				break;
				
			case 8://sweping {

				System.out.println("***********High Street Hospital HR Menu************");
				System.out.println("");
				System.out.println("ID  Job Title          Name          Implication");
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
					
					if(employees instanceof Janitor) {
					System.out.println(employees.employeeID() + " " + jobTitle + "  " + employees.employeeName() + "   " + employees.getImplication());
					}
					
				
				}
				System.out.println("***************************************************");
				System.out.println("Select the ID of the person to sweep the floors");
				String janitorSweep = input.next();
				
				Employee janitor = hospitalRoster.getEmployeeID(janitorSweep);
				
				if (janitor.IsWorking()) {
					System.out.println("He's already sweeping the floors");
				} else {
					janitor.toggleWorking();
				System.out.println("The janitor is now sweeping the floors!");
				System.out.println("This will make people think we are a legitimate hosptial.");
				}
				
				
					
			break;	
			//close actionOpton 8
			case 10: 
				mainMenu(input, hospitalRoster, patientCensus);
				interaction = !interaction;
				break;
				
				
			//close actionOption 10
		}
		}//close while
	}

	

	private static int actionMenu(Scanner input) {
		System.out.println("*********************Action Menu******************");
		System.out.println("              1.  Draw Blood");
		System.out.println("              2.  Give Blood to Dennis ");
		System.out.println("              3.  Treat Patients");
		System.out.println("              4.  Perform Surgury");
		System.out.println("              5.  Feed Patient");
		System.out.println("              6.  Answer Phone");
		System.out.println("              7.  Organize Papers");
		System.out.println("              8.  Sweep the floor");
		System.out.println("              10.  Main Menu");
		System.out.println("*************************************************");
		
		System.out.println("Select number of action you wish to complete");
		int actionOption = input.nextInt();
		return actionOption;
	}
		
		
		
		
		
		
		
		

	

}
