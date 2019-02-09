import java.util.HashMap;

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
	public Patient(int bloodLevel) {
		this.bloodLevel = bloodLevel;
	
		
		
	}

	public String patientID() {
		
		return patientID;
	}

	public String patientName() {
		
		return patientName;
	}

	public int checkBlood() {
		
		return bloodLevel;
	}

	public int changeBlood(int bloodAdjustment) {
		this.bloodLevel += bloodAdjustment;
		return bloodAdjustment;
		// TODO Auto-generated method stub
		
	}

}
