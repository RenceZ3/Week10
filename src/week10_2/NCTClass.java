package week10_2;

public class NCTClass extends StudentClass{
	
	private String location;
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void displayLocation() {
		System.out.printf("You are from %s", location);
	}
	
}
