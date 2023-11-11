package week10_2;

import java.util.Scanner;
/*
 * Clarence Juanata
 * 4537982
 * Sumithra CHANDRASEKAR
 */
public class MainMethod {

	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		NCTClass sc1 = new NCTClass();
		
		System.out.print("Please input number of grades: ");
		int num = scn.nextInt();
		
		double storeGrades[] = new double[num];
		String storeSubjects[] = new String[num];
		
		for(int i=0; i<storeGrades.length; i++) {
			System.out.print("Input Subject: ");
			storeSubjects[i] = scn.next();
			sc1.setSubjects(storeSubjects);
			
			System.out.print("Input Grade: ");
			storeGrades[i] = scn.nextDouble();
			sc1.setGrades(storeGrades);
			
		}
		
		System.out.print("Where are you from?: ");
		String location = scn.next();
		sc1.setLocation(location);
		
		
		sc1.getDetails();
		sc1.displayLocation();
		
		
		
		
		
	}

}
