package week10_2;

public class StudentClass {
	private double grades[];
	private String subjects[];
	
	public double[] getGrades() {
		return grades;
	}
	public void setGrades(double[] grades) {
		this.grades = grades;
	}
	public String[] getSubjects() {
		return subjects;
	}
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	
	public void getDetails() {
		System.out.println("Your grades are:");
		System.out.println("================================================");
		for(int i=0; i<grades.length; i++) {
			System.out.println(subjects[i] + " " + grades[i]);
		}
	}
	
	

}
