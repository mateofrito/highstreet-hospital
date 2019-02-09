import java.util.HashMap;

public class Census {

	private HashMap<String, Patient> patientTable = new HashMap<String, Patient>();
	
	
	public Patient getPatientID(String patientID) {
		return patientTable.get(patientID);
	}
	
	
	
	public int getNumofPatients() {
		return patientTable.size();
	}

	public void addPatients(Patient newPat) {
		patientTable.put(newPat.patientID(), newPat);
		
	}
	
	public HashMap<String, Patient> getPatients(){
		return patientTable;
	}

	

}
