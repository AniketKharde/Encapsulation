package encapsulation1;

import java.util.Scanner;

public class HrDept {
	
	private int salary = 10000;
	
	
	public int getsalary() {
		Scanner sec = new Scanner(System.in);
		System.out.println("Enter Password: ");
		String password = sec.nextLine();
		if(password.equals("Aniket123#"))
			return salary;
		else
			return (Integer) null;
		
	}

}
