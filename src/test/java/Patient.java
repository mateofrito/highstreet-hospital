

public class Patient {
	
	private String patientName;
	private String patientID;
	private int healthPoints;
	private int bloodLevel;

	
	public Patient(String patientName, String patientID) {
		this.patientName = patientName;
		this.patientID = patientID;
		this.healthPoints = 100;
		this.bloodLevel = 100;
		
	}
	
	
	
	
	public int getBloodLevel() {
		return bloodLevel;
	}
	

	public String patientID() {
		return patientID;
	}

	public String patientName() {
		return patientName;
	}

	

	public int changeBlood(int bloodAdjustment) {
		
		return bloodAdjustment;
		// TODO Auto-generated method stub
		
	}

}
