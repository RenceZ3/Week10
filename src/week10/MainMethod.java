package week10;


/*
 * Clarence Juanata
 * 4537982
 * Sumithra CHANDRASEKAR
 */
public class MainMethod {

	public static void main(String[] args) {
		EmployeeClass emp1 = new EmployeeClass();
		
		System.out.println();
		emp1.setName("Clarence");
		emp1.setSalary(15.99);
		
		String name = emp1.getName();
		double salary = emp1.getSalary();
		
		System.out.printf("Your name is %s, and your salary %.2f per hour is.", name, salary);

	}

}
