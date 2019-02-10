

public class Patient {
	
	private String patientName;
	private String patientID;
	private int healthPoints;
	private int bloodLevel;

	
	public Patient(String patientID, String patientName) {
		this.patientName = patientName;
		this.patientID = patientID;
		this.healthPoints = 100;
		this.bloodLevel = 100;
		
	}
	
	public Patient() {
		
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

	

	public int drawBlood(int blooddraw) {
		this.bloodLevel += blooddraw;
		return blooddraw;
		
		
	}

}
